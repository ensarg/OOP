package tr.edu.sehir.oop;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Vector;
import javax.swing.*;
/**
 * The control logic and main display panel for game.
 *
 *
 */

// create
public class BallWorld4 extends JPanel {
    private static final int UPDATE_RATE = 30;    // Frames per second (fps)

    //private Ball ball1, ball2;         // A single bouncing Ball's instance

    Vector<Ball>  balls = new Vector<Ball>();

    private ContainerBox box;  // The container rectangular box

    private DrawCanvas canvas; // Custom canvas for drawing the box/ball
    private int canvasWidth;
    private int canvasHeight;

    /**
     * Constructor to create the UI components and init the game objects.
     * Set the drawing canvas to fill the screen (given its width and height).
     *
     * @param width : screen width
     * @param height : screen height
     */
    public BallWorld4(int width, int height) {


        canvasWidth = width;
        canvasHeight = height;

        // Init the ball at a random location (inside the box) and moveAngle


        // Init the Container Box to fill the screen
        box = new ContainerBox(0, 0, canvasWidth, canvasHeight, Color.BLACK, Color.WHITE);

        // Init the custom drawing panel for drawing the game
        canvas = new DrawCanvas();
        this.setLayout(new BorderLayout());
        this.add(canvas, BorderLayout.CENTER);

        // Handling window resize.
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Component c = (Component)e.getSource();
                Dimension dim = c.getSize();
                canvasWidth = dim.width;
                canvasHeight = dim.height;
                // Adjust the bounds of the container to fill the window
                box.set(0, 0, canvasWidth, canvasHeight);
            }
        });

        // Start the ball bouncing
        gameStart();
        System.out.println("Number of balls at startup: "+ Ball.getNumberOfBalls());
    }
    public void createBalls(){
        int x,y;
        int speed;
        int angleInDegree;
        int balltype=0;
        Random rand = new Random();
        int radius = 20;

        //for (int j=0; j < rand.nextInt(100); j++) {
        for (int j=0; j < 100; j++) {
            balltype = rand.nextInt(2);
            if (balltype == 0)
            {
                x = rand.nextInt(canvasWidth - radius * 2 - 20) + radius + 10;
                y = rand.nextInt(canvasHeight - radius * 2 - 20) + radius + 10;
                speed = 5;
                angleInDegree = rand.nextInt(360);
                balls.add( new CircleBall(x, y, radius, speed, angleInDegree, Color.BLUE));
            }else{
                x = rand.nextInt(canvasWidth - radius * 2 - 20) + radius + 10;
                y = rand.nextInt(canvasHeight - radius * 2 - 20) + radius + 10;
                speed = 5;
                angleInDegree = rand.nextInt(360);
                balls.add (new SquareBall(x, y, radius, speed, angleInDegree, Color.BLUE));

            }
        }

    }
    /** Start the ball bouncing. */
    public void gameStart() {

        // Run the game logic in its own thread.
        Thread gameThread = new Thread() {
            public void run() {
                int x=0;
                while (true) {
                    // Execute one time-step for the game

                    gameUpdate();
                    // Refresh the display
                    repaint();
                    // Delay and give other thread a chance
                    if ((x++ %5) ==0 ) {
                        createBalls();
                        System.out.println("Number of balls: "+ Ball.getNumberOfBalls());
                    }
                    try {
                        Thread.sleep(30000 / UPDATE_RATE);
                    } catch (InterruptedException ex) {}
                }
            }
        };
        gameThread.start();  // Invoke GaemThread.run()
    }

    /**
     * One game time-step.
     * Update the game objects, with proper collision detection and response.
     */
    public void gameUpdate() {
        Ball b;
        for (int i=0; i < balls.size();i++) {
            b =  balls.elementAt(i);
            b.moveOneStepWithCollisionDetection(box);
        }


    }

    /** The custom drawing panel for the bouncing ball (inner class). */
    class DrawCanvas extends JPanel {
        /** Custom drawing codes */
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);    // Paint background
            // Draw the box and the ball
            box.draw(g);
            Ball b;
            for (int i=0; i < balls.size();i++) {
                b =  balls.elementAt(i);
                b.draw(g);
            }

        }

        /** Called back to get the preferred size of the component. */
        @Override
        public Dimension getPreferredSize() {
            return (new Dimension(canvasWidth, canvasHeight));
        }
    }
}
