package edu.sehir.oop;

import javax.swing.*;

public class testTextDemo {

    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //TextDemo.createAndShowGUI();
                JFrame frame = new JFrame("TextDemo");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                //Add contents to the window.
                frame.add(new TextDemo());

                //Display the window.
                frame.pack();
                frame.setVisible(true);

            }
        });
    }
}
