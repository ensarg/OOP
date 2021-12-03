package tr.edu.sehir.oop;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.Vector;
import javax.swing.*;


/**
 * The control logic and main display panel for game.
 *
 * @author Hock-Chuan Chua
 * @version October 2010
 * modified by egul
 */
public class BallWorld3b extends JPanel {
    private static final int UPDATE_RATE = 30;    // Frames per second (fps)
    public static final int LEFT_COMPUTER = 0;
    public static final int RIGHT_COMPUTER = 1;


    //private Ball ball1, ball2;         // A single bouncing Ball's instance

    Vector<Ball3> balls = new Vector<Ball3>();

    private ContainerBox box;  // The container rectangular box

    private DrawCanvas canvas; // Custom canvas for drawing the box/ball
    private int canvasWidth;
    private int canvasHeight;
    private int computerNo; // 0 left  1 right
    //private int serverPort; // 0 left  1 right
    ServerSocket ssocket;
    Socket socketin;
    ObjectInputStream is = null;
    //InetAddress  ipadress_of_othercomputer;
    String ipadress_of_othercomputer;
    int serverportno_of_othercomputer;
    int server_port_of_thiscomputer;
    Socket clientsocket;
    ObjectOutputStream os = null;


    int radius = 20;
    int speed = 5;
    int angleInDegree = 45;

    Color cc = new Color(255, 0, 0);

    /**
     * Constructor to create the UI components and init the game objects.
     * Set the drawing canvas to fill the screen (given its width and height).
     *
     * @param width  : screen width
     * @param height : screen height
     */
    public BallWorld3b(int width, int height, int computerno, int server_port_of_thiscomputer, String ipadress_of_othercomputerin, int serverportno_of_othercomputerin) {
        int x, y;


        int balltype = 0;


        canvasWidth = width;
        canvasHeight = height;
        computerNo = computerno;
        ipadress_of_othercomputer = ipadress_of_othercomputerin;
        serverportno_of_othercomputer = serverportno_of_othercomputerin;
        this.server_port_of_thiscomputer = server_port_of_thiscomputer;
        // Init the ball at a random location (inside the box) and moveAngle
        Random rand = new Random();


        for (int j = 0; j < 10 /*rand.nextInt(3)*/; j++) {
            balltype = rand.nextInt(3);
            balltype = 0;
            if (balltype == 0) {
                x = rand.nextInt(canvasWidth - radius * 2 - 20) + radius + 10;
                y = rand.nextInt(canvasHeight - radius * 2 - 20) + radius + 10;
                speed = 5;
                angleInDegree = rand.nextInt(360);
                if (computerNo == RIGHT_COMPUTER)
                    balls.add(new circleBall3(x, y, radius, speed, angleInDegree, Color.BLUE));
                if (computerNo == LEFT_COMPUTER)
                    balls.add(new circleBall3(x, y, radius, speed, angleInDegree, Color.RED));
                // System.out.println("new circle ball is added to vector");

            } /*else if (balltype == 1) {
                x = rand.nextInt(canvasWidth - radius * 2 - 20) + radius + 10;
                y = rand.nextInt(canvasHeight - radius * 2 - 20) + radius + 10;
                speed = 5;
                angleInDegree = rand.nextInt(360);
                balls.add(new squareBall(x, y, radius, speed, angleInDegree, Color.BLUE));
            }else {
                x = rand.nextInt(canvasWidth - radius * 2 - 20) + radius + 10;
                y = rand.nextInt(canvasHeight - radius * 2 - 20) + radius + 10;
                speed = 5;
                angleInDegree = rand.nextInt(360);
                balls.add (new ellipseBall(x, y, radius*2,radius, speed, angleInDegree, Color.YELLOW));


            }
            */

        }

        // Init the Container Box to fill the screen
        box = new ContainerBox(0, 0, canvasWidth, canvasHeight, Color.BLACK, Color.WHITE);

        // Init the custom drawing panel for drawing the game
        canvas = new DrawCanvas(box, balls, canvasWidth, canvasHeight);
        this.setLayout(new BorderLayout());
        this.add(canvas, BorderLayout.CENTER);

        // Handling window resize.
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Component c = (Component) e.getSource();
                Dimension dim = c.getSize();
                canvasWidth = dim.width;
                canvasHeight = dim.height;
                // Adjust the bounds of the container to fill the window
                box.set(0, 0, canvasWidth, canvasHeight);
            }
        });


        // Start the ball bouncing
        gameStart();
        //System.out.println("Number of balls: "+ Ball.getNumberOfBalls());
        //System.out.println("Number of balls: "+ balls.size());
    }


    public void gameStart() {

        if (computerNo == RIGHT_COMPUTER) {
            ServerThread serverthrd = new ServerThread(balls, server_port_of_thiscomputer,1);
            serverthrd.start();
        }

        if (computerNo == LEFT_COMPUTER) {
            try {
                clientsocket = new Socket(ipadress_of_othercomputer, serverportno_of_othercomputer);
                os = new ObjectOutputStream(clientsocket.getOutputStream());
                System.out.println("Client opened socket connection");
            } catch (UnknownHostException exp) {
                System.out.println("something went creating client socket ... unkown host");
            } catch (IOException exp) {
                System.out.println("omething went creating client socket  ...");
            }
        }

        GameThread gmthr = new GameThread(this, 50);

        gmthr.start();  // Invoke GaemThread.run()


    }


    /**
     * One game time-step.
     * Update the game objects, with proper collision detection and response.
     */
    public void gameUpdate() {
        Ball3 b;
        boolean hitedge;

        if (computerNo == RIGHT_COMPUTER) {


            for (int i = 0; i < balls.size(); i++) {
                b = balls.elementAt(i);
                b.moveOneStepWithCollisionDetection(box, computerNo);


            }

        }


        if (computerNo == LEFT_COMPUTER) {
            for (int i = 0; i < balls.size(); i++) {
                b = balls.elementAt(i);

                if (b.moveOneStepWithCollisionDetection(box, computerNo)) {

                    //this part will only be executed by left computer
                    System.out.println("Ball hits right edge on the left computer ");
                    // System.out.println("sending ball to next computer");

                    //public aCoordinate(float x, float y, float radius, float speed, float angleInDegree)


                    try {

                        System.out.println("ball: x :" + b.getX() + " y: " + b.getY());
                        aCoordinate ac1 = new aCoordinate(b.getX(), b.getY(), radius, b.getSpeed(), b.getMoveAngle());
                        System.out.println("aCoordinate: x :" + ac1.getX() + " y: " + ac1.getY() +"angle: "+ ac1.getAngleInDegree());
                        os.writeObject(ac1);
                        //os.writeObject(b);
                        System.out.println("---------------------------------------------------");
                        //os.writeObject(b);
                        //  System.out.println("message sent to the server ...x: "+ac1.x+" y: "+ac1.y+"radius: "+ac1.radius );
                        //socket.close();
                    } catch (IOException exp) {
                        System.out.println("sometthing went wrong while sending  object to right...");
                        exp.printStackTrace();
                    }

                    balls.remove(b);

                }


            }



        }


    }

}
