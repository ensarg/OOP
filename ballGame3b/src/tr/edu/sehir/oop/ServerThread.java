package tr.edu.sehir.oop;
import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ServerThread extends Thread{


    ServerSocket  ssocket;
    Socket socketin;
    ObjectInputStream is=null;
    //InetAddress  ipadress_of_othercomputer;
    String  ipadress_of_othercomputer;
    int serverportno_of_othercomputer;
    Socket clientsocket;
    ObjectOutputStream os=null;
    Vector<Ball3> balls;

    public ServerThread(Vector<Ball3> balls  ,  int server_port_of_thiscomputer, int timeout) {   // constructor
        this.balls = balls;
        try{
            ssocket = new ServerSocket(server_port_of_thiscomputer);
            System.out.println("Server is ready to accept connections");
            socketin = ssocket.accept();
            System.out.println("a connection from left compter accepted");
            //ssocket.setSoTimeout(timeout);
            is = new ObjectInputStream(socketin.getInputStream());
        } catch (IOException e) {
            System.out.println("Could not listen on port +"+ server_port_of_thiscomputer );
            System.exit(-1);
        }
    }



    public void run() {
        while (true) {
            try {

                aCoordinate ac = new aCoordinate();
                ac = (aCoordinate) is.readObject();
                //Ball3 b3 = new Ball3();
                // b3 =(Ball3) is.readObject();
                System.out.println("server side: x :" +ac.getX()+ " y: "+ac.getY()+"angle: "+ac.getAngleInDegree());
                balls.add( new circleBall3(ac.getX(), ac.getY(), ac.getRadius(), ac.getSpeed(), ac.getAngleInDegree(), Color.RED));
                //balls.add( b3);
                System.out.println("---------------------------------------------------");
                // Execute one time-step for the game
                //sleep(100);

            } catch (IOException exp) {
            // System.out.println("something went wrong while receiving object from left...");
            //exp.printStackTrace();
             } catch(ClassNotFoundException cl) {
                System.out.println("something went wrong : class not found...");

            }
        }
    }


}