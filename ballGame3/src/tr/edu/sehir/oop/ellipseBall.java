package tr.edu.sehir.oop;


import java.awt.*;
import java.util.Formatter;
import java.awt.geom.Ellipse2D;

public class ellipseBall extends Ball {

    //float x, y;           // Ball's center x and y (package access)
    //float speedX, speedY; // Ball's speed per step in x and y (package access)
    float radius;         // Ball's radius (package access)
    //private Color color;  // Ball's color
    private static final Color DEFAULT_COLOR = Color.BLUE;

    /**
     * Constructor: For user friendliness, user specifies velocity in speed and
     * moveAngle in usual Cartesian coordinates. Need to convert to speedX and
     * speedY in Java graphics coordinates for ease of operation.
     */


    //float x, y;           // Ball's center x and y (package access)
    //float speedX, speedY; // Ball's speed per step in x and y (package access)
    float rectwidth,rectheight ;         // Ball's xlength
    private Color color;  // Ball's color

    /**
     * Constructor: For user friendliness, user specifies velocity in speed and
     * moveAngle in usual Cartesian coordinates. Need to convert to speedX and
     * speedY in Java graphics coordinates for ease of operation.
     */

    public ellipseBall(float x, float y, float rectwidth, float rectheight, float speed, float angleInDegree,
                       Color color) {
        super( x,  y, speed, angleInDegree, color);
        // Convert (speed, angle) to (x, y), with y-axis inverted
        this.rectwidth = rectwidth;
        this.rectheight = rectheight;
        this.color =color;


    }
    /** Constructor with the default color */
    //public squareBall(float x, float y, float radius, float speed, float angleInDegree) {
    //    this(x, y, xlength, speed, angleInDegree, DEFAULT_COLOR);
    // }

    /**
     * Make one move, check for collision and react accordingly if collision occurs.
     *
     * @param box: the container (obstacle) for this ball.
     */

    @Override
    public  boolean moveOneStepWithCollisionDetection(ContainerBox box) {
        // Get the ball's bounds, offset by the radius of the ball
        float ballMinX = box.minX   + (rectwidth/2);
        float ballMinY = box.minY  + (rectheight/2);
        float ballMaxX = box.maxX - (rectwidth/2);
        float ballMaxY = box.maxY - (rectheight/2);

        // Calculate the ball's new position
        x += speedX;
        y += speedY;
        // Check if the ball moves over the bounds. If so, adjust the position and speed.
        if (x < ballMinX) {
            speedX = -speedX; // Reflect along normal
            x = ballMinX;     // Re-position the ball at the edge
        } else if (x > ballMaxX) {
            speedX = -speedX;
            x = ballMaxX;

        }
        // May cross both x and y bounds
        if (y < ballMinY) {
            speedY = -speedY;
            y = ballMinY;
        } else if (y > ballMaxY) {
            speedY = -speedY;
            y = ballMaxY;
        }
    return false;
    }


    /** Draw itself using the given graphics context. */
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(new Ellipse2D.Double(x, y,
                rectwidth,
                rectheight));

    }


}