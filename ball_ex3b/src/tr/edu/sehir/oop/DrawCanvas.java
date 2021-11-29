package tr.edu.sehir.oop;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class DrawCanvas extends JPanel {
    /** Custom drawing codes */

   ContainerBox box;
   Vector<Ball3> balls;
   int canvasWidth, canvasHeight;

    public DrawCanvas(ContainerBox box, Vector<Ball3>  balls,int canvasWidth, int canvasHeight){

        this.box=box;
        this.balls=balls;
        this.canvasWidth=canvasWidth;
        this.canvasHeight=canvasHeight;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);    // Paint background
        // Draw the box and the ball

        box.draw(g);
        Ball3 b;
        for (int i=0; i < balls.size();i++) {
            b =  balls.elementAt(i);
            b.draw(g);
        }

    }


    /** Called back to get the preferred size of the component. */
  //  @Override

    public Dimension getPreferredSize() {
        return (new Dimension(canvasWidth, canvasHeight));
    }


}




