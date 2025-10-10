import java.io.*;
import java.net.*;
import controller.AppController;
import model.ClickModel;
import view.HtmlView;

public class SimpleHttpServer {

   public static void main(String[] args) {
      int port = 8080;
      ClickModel model = new ClickModel();
      HtmlView view = new HtmlView();
      AppController controller = new AppController(model, view);

      try (ServerSocket serverSocket = new ServerSocket(port)) {
         System.out.println("MVC Server running at http://localhost:" + port);

         while (true) {
            try (Socket clientSocket = serverSocket.accept()) {
               controller.handleClient(clientSocket);
            } catch (IOException e) {
               System.err.println("Client error: " + e.getMessage());
            }
         }

      } catch (IOException e) {
         System.err.println("Server error: " + e.getMessage());
      }
   }
}

