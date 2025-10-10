import java.io.*;
import java.net.*;

public class SimpleHttpServer {

   public static void main(String[] args) {
      int port = 8080;
      try (ServerSocket serverSocket = new ServerSocket(port)) {
         System.out.println("Server running on http://localhost:" + port);

         while (true) {
            try (Socket clientSocket = serverSocket.accept()) {
               handleClient(clientSocket);
            } catch (IOException e) {
               System.err.println("Client connection error: " + e.getMessage());
            }
         }

      } catch (IOException e) {
         System.err.println("Server error: " + e.getMessage());
      }
   }

   private static void handleClient(Socket clientSocket) throws IOException {
      BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
      OutputStream out = clientSocket.getOutputStream();

      // Read the request line (e.g., "GET / HTTP/1.1")
      String requestLine = in.readLine();
      if (requestLine == null || requestLine.isEmpty()) return;

      System.out.println("Request: " + requestLine);

      // Serve index.html for GET /
      if (requestLine.startsWith("GET / ")) {
         sendResponse(out, "index.html", "text/html");
      } else {
         send404(out);
      }

      out.flush();
      in.close();
      out.close();
   }

   private static void sendResponse(OutputStream out, String filePath, String contentType) throws IOException {
      File file = new File(filePath);
      if (!file.exists()) {
         send404(out);
         return;
      }

      byte[] content = java.nio.file.Files.readAllBytes(file.toPath());
      String header = "HTTP/1.1 200 OK\r\n" +
            "Content-Type: " + contentType + "\r\n" +
            "Content-Length: " + content.length + "\r\n" +
            "Connection: close\r\n\r\n";

      out.write(header.getBytes());
      out.write(content);
   }

   private static void send404(OutputStream out) throws IOException {
      String response = "HTTP/1.1 404 Not Found\r\n" +
            "Content-Type: text/plain\r\n" +
            "Connection: close\r\n\r\n" +
            "404 - File Not Found";
      out.write(response.getBytes());
   }
}

