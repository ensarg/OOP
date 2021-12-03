package tr.edu.sehir.oop;

import javax.swing.*;
import java.util.Vector;
// balls run in 2 frames, passing from one to other
public class MainBW3 {

    public static void main(String[] args) {
        Vector<Ball> balls1= new Vector<Ball>();
        Vector<Ball> balls2= new Vector<Ball>();

        JFrame frame1 = new JFrame(" World of Balls 1");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setContentPane(new BallWorld3(640, 480,balls1,balls2)); // BallWorld is a JPanel

        // use BalWorld2 to create random number of balls
        frame1.pack();            // Preferred size of BallWorld
        frame1.setVisible(true);  // Show it

        JFrame frame2 = new JFrame("World of Balls 2");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setContentPane(new BallWorld3(640, 480,balls2,balls1)); // BallWorld is a JPanel

        // use BalWorld2 to create random number of balls
        frame2.pack();            // Preferred size of BallWorld
        frame2.setVisible(true);  // Show it
    }
}
