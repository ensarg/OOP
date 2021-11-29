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
public class BallWorld2 extends JPanel {
    //private static final int UPDATE_RATE = 30;    // Frames per second (fps)
    //private Ball ball1, ball2;         // A single bouncing Ball's instance

    private final Vector<Ball>  balls = new Vector<>();
    private final ContainerBox box;  // The container rectangular box

    //private DrawCanvas canvas; // Custom canvas for drawing the box/ball
    private int canvasWidth;
    private int canvasHeight;


    //private final int updaterate=20;

    /**
     * Constructor to create the UI components and init the game objects.
     * Set the drawing canvas to fill the screen (given its width and height).
     *
     * @param width : screen width
     * @param height : screen height
     */
    public BallWorld2(int width, int height) {
        int x,y;
        int speed;
        int angleInDegree;
        int balltype;
        final DrawCanvas drawCanvas;

        canvasWidth = width;
        canvasHeight = height;

        // Init the ball at a random location (inside the box) and moveAngle
        Random rand = new Random();
        int radius = 20;

        for (int j=0; j < rand.nextInt(50); j++) {
            balltype = rand.nextInt(3);
            if (balltype == 0)
            {
                x = rand.nextInt(canvasWidth - radius * 2 - 20) + radius + 10;
                y = rand.nextInt(canvasHeight - radius * 2 - 20) + radius + 10;
                speed = rand.nextInt(10)+1;
                angleInDegree = rand.nextInt(360);
                balls.add( new circleBall(x, y, radius, speed, angleInDegree, Color.BLUE));
            }else if (balltype == 1) {
                x = rand.nextInt(canvasWidth - radius * 2 - 20) + radius + 10;
                y = rand.nextInt(canvasHeight - radius * 2 - 20) + radius + 10;
                speed = rand.nextInt(10)+1;
                angleInDegree = rand.nextInt(360);
                balls.add(new squareBall(x, y, radius, speed, angleInDegree, Color.BLUE));
            }else {

                x = rand.nextInt(canvasWidth - radius * 2 - 20) + radius + 10;
                y = rand.nextInt(canvasHeight - radius * 2 - 20) + radius + 10;
                speed = rand.nextInt(10)+1;
                angleInDegree = rand.nextInt(360);
                balls.add (new ellipseBall(x, y, radius*2,radius, speed, angleInDegree, Color.YELLOW));


            }


        }

        // Init the Container Box to fill the screen
        box = new ContainerBox(0, 0, canvasWidth, canvasHeight, Color.BLACK, Color.WHITE);

        // Init the custom drawing panel for drawing the game
        drawCanvas = new DrawCanvas(box,balls);
        this.setLayout(new BorderLayout());
        this.add(drawCanvas, BorderLayout.CENTER);

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
        GameThread gameThread= new GameThread(this,20);
        gameThread.start();
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
        //ball1.moveOneStepWithCollisionDetection(box);
        //ball2.moveOneStepWithCollisionDetection(box);

    }

    //Called back to get the preferred size of the component. */
    public Dimension getPreferredSize() {
        return (new Dimension(canvasWidth, canvasHeight));
    }
}
