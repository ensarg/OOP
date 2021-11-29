package tr.edu.sehir.oop;


import java.awt.*;
import java.io.Serializable;

public class Ball3 implements Serializable {

    float x, y;           // Ball's center x and y (package access)
    float speedX, speedY; // Ball's speed per step in x and y (package access)
    // float radius;         // Ball's radius (package access)
    Color color;  // Ball's color
    private static final Color DEFAULT_COLOR = Color.BLUE;
    private static int numberOfBalls = 0;

   public Ball3(){
       this.x = 0;
       this.y = 0;
       // Convert (speed, angle) to (x, y), with y-axis inverted
       this.speedX = 0;;
       this.speedY = 0;
       this.color = Color.WHITE;
   }

    public Ball3(float x, float yp, float speed, float angleInDegree,
                Color color) {
        this.x = x;
        this.y = y;
        // Convert (speed, angle) to (x, y), with y-axis inverted
        this.speedX = (float) (speed * Math.cos(Math.toRadians(angleInDegree)));
        this.speedY = (float) (-speed * (float) Math.sin(Math.toRadians(angleInDegree)));
        this.color = color;
        numberOfBalls++;
    }
    public static int getNumberOfBalls(){
        return numberOfBalls;
    }
    /**
     * Return the magnitude of speed.
     */
    public float getSpeed() {
        return (float) Math.sqrt(speedX * speedX + speedY * speedY);
    }

    /**
     * Return the direction of movement in degrees (counter-clockwise).
     */
    public float getMoveAngle() {
        return (float) Math.toDegrees(Math.atan2(-speedY, speedX));
    }

    public float getX(){return x;}
    public float getY(){return y;}

    public void draw(Graphics g) {
        g.setColor(color);
   }

    public boolean moveOneStepWithCollisionDetection(ContainerBox box, int computerno) {
        // Get the ball's bounds, offset by the radius of the ball
        // Calculate the ball's new position
       return false;
    }


}