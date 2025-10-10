package controller;

import java.io.*;
import java.net.Socket;
import model.ClickModel;
import view.HtmlView;

public class AppController {

   private final ClickModel model;
   private final HtmlView view;

   public AppController(ClickModel model, HtmlView view) {
      this.model = model;
      this.view = view;
   }

   public void handleClient(Socket clientSocket) throws IOException {
      BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
      OutputStream out = clientSocket.getOutputStream();

      String requestLine = in.readLine();
      if (requestLine == null || requestLine.isEmpty()) return;

      System.out.println("Request: " + requestLine);

      String responseBody;
      if (requestLine.startsWith("GET /click")) {
         model.increment(); // update model
         responseBody = view.renderPage(model.getClickCount());
         sendResponse(out, responseBody);
      } else if (requestLine.startsWith("GET / ")) {
         responseBody = view.renderPage(model.getClickCount());
         sendResponse(out, responseBody);
      } else {
         send404(out);
      }

      in.close();
      out.close();
   }

   private void sendResponse(OutputStream out, String content) throws IOException {
      byte[] body = content.getBytes();
      String header = "HTTP/1.1 200 OK\r\n" +
            "Content-Type: text/html; charset=UTF-8\r\n" +
            "Content-Length: " + body.length + "\r\n" +
            "Connection: close\r\n\r\n";
      out.write(header.getBytes());
      out.write(body);
   }

   private void send404(OutputStream out) throws IOException {
      String response = "HTTP/1.1 404 Not Found\r\n" +
            "Content-Type: text/plain\r\n\r\n" +
            "404 - Not Found";
      out.write(response.getBytes());
   }
}
