package tr.edu.sehir.oop;



import java.awt.*;
import java.awt.event.*;
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
public class BallWorld3 extends JPanel {
    private static final int UPDATE_RATE = 30;    // Frames per second (fps)

    //private Ball ball1, ball2;         // A single bouncing Ball's instance

    Vector<Ball>  balls;// = new Vector<Ball>();
    Vector<Ball>  other_balls;

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
    public BallWorld3(int width, int height, Vector<Ball>  balls, Vector<Ball>  other_balls) {
        int x,y;
        int speed;
        int angleInDegree;
        int balltype=0;

        canvasWidth = width;
        canvasHeight = height;
        this.balls=balls;
        this.other_balls=other_balls;

        // Init the ball at a random location (inside the box) and moveAngle
        Random rand = new Random();
        int radius = 20;
        boolean flip=false;
        for (int j=0; j < rand.nextInt(200); j++) {
            balltype = rand.nextInt(3);
            //balltype=0;

            if (balltype == 0)
            {
                x = rand.nextInt(canvasWidth - radius * 2 - 20) + radius + 10;
                y = rand.nextInt(canvasHeight - radius * 2 - 20) + radius + 10;
                speed = 5;
                angleInDegree = rand.nextInt(360);
                //balls.add( new circleBall(x, y, radius, speed, angleInDegree, Color.BLUE));
                if(flip) {
                    balls.add(new CircleBall2(x , y , radius, speed, angleInDegree , Color.RED));
                    flip=!flip;
                } else {
                    balls.add(new CircleBall2(x + 5, y + 5, radius, speed, angleInDegree + 5, Color.BLUE));
                    flip=!flip;
                }
            }else if (balltype == 1) {
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


        }

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
        System.out.println("Number of balls: "+ Ball.getNumberOfBalls());
    }

    /** Start the ball bouncing. */
    public void gameStart() {
        // Run the game logic in its own thread.
        Thread gameThread = new Thread() {
            public void run() {
                while (true) {
                    // Execute one time-step for the game
                    gameUpdate();
                    // Refresh the display
                    repaint();
                    // Delay and give other thread a chance
                    try {
                        Thread.sleep(1000 / UPDATE_RATE);
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
            if(b.moveOneStepWithCollisionDetection(box)){
                other_balls.add(b);
                balls.remove(b);
            }
            }
        //ball1.moveOneStepWithCollisionDetection(box);
        //ball2.moveOneStepWithCollisionDetection(box);

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
            //ball1.draw(g);
            //ball2.draw(g);
            // Display ball's information
            //g.setColor(Color.WHITE);
            //g.setFont(new Font("Courier New", Font.PLAIN, 12));
            //g.drawString("Ball " + ball.toString(), 20, 30);
        }

        /** Called back to get the preferred size of the component. */
        @Override
        public Dimension getPreferredSize() {
            return (new Dimension(canvasWidth, canvasHeight));
        }
    }
}
