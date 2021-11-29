package tr.edu.sehir.oop;

import javax.swing.*;

public class MainBW2 {

    public static void main(String[] args) {
        JFrame frame2 = new JFrame("Another World of Balls");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setContentPane(new BallWorld2(640, 480)); // BallWorld is a JPanel

        // use BalWorld2 to create random number of balls
        frame2.pack();            // Preferred size of BallWorld
        frame2.setVisible(true);  // Show it
    }
}
