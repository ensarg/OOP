package tr.edu.maltepe.sockets;

import tr.edu.maltepe.sockets.Message1;
import tr.edu.maltepe.sockets.Message2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
        public static final int port = 4444;
        private ServerSocket ss = null;

        public void runServer() throws IOException, ClassNotFoundException {
            ss = new ServerSocket(port);
            System.out.println("Server is ready to accept connections");
            Socket socket = ss.accept();

            ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream is = new ObjectInputStream(socket.getInputStream());


            Message2 m = (Message2) is.readObject();
            doSomething2(m);

            os.writeObject(m);
            socket.close();
        }

        private void doSomething(Message1 m) {
            m.setResult(m.getA().intValue() , m.getB().intValue());
        }
        private void doSomething2(Message2 m) {
            m.setResult(m.getA() , m.getB());
        }

}


