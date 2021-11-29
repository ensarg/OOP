package tr.edu.sehir.oop;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/** The custom drawing panel for the bouncing ball (inner class).
 */

public class DrawCanvas extends JPanel {
    /** Custom drawing codes */
    private Vector<Ball> balls;
    private ContainerBox box;
    public DrawCanvas(ContainerBox box,Vector<Ball> balls){
        this.balls=balls;
        this.box=box;
    }
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

}
