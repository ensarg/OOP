package tr.edu.sehir.oop;

import javax.swing.*;
/**
        * Main Program for running the bouncing ball as a standalone application.
        *
        * @author Hock-Chuan Chua
        * @version October 2010
 *      modified by egul
        */

//try to run  game on 2 computers
public class MainBW3 {

    public static final int computer1 = 0;
    public static final int computer2 = 1;






    // Entry main program
    public static void main(String[] args) {
         // Run UI in the Event Dispatcher Thread (EDT), instead of Main thread

        String computername="";
        int computer=0;
        if (args.length !=1){
            System.exit(0);
        } else if (args.length ==1){
            computername= args[0];
           // computername.concat("ball world");
            if (args[0].equalsIgnoreCase("computer1"))
                computer=0;
            else if (args[0].equalsIgnoreCase("computer2")) computer=1;
            else {
                System.out.println("computer name should be either computer1 or computer2");
                System.exit(0);
            }
        }





        //javax.swing.SwingUtilities.invokeLater(new Runnable() {
          //  public void run() {

                JFrame frame = new JFrame("A World of Balls "+ computername);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                /*
                frame.setContentPane(new BallWorld2(640, 480)); // BallWorld is a JPanel
                // use BalWorld2 to create random number of balls
                */

                BallWorld3 bw3 = new BallWorld3(640, 480, computer, 4000,"192.168.1.43",4000) ;


                frame.setContentPane(bw3);


                frame.pack();            // Preferred size of BallWorld
                frame.setVisible(true);  // Show it
                /*
                JFrame frame2 = new JFrame("Another World of Balls");
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setContentPane(new BallWorld2(640, 480)); // BallWorld is a JPanel

                // use BalWorld2 to create random number of balls
                frame2.pack();            // Preferred size of BallWorld
                frame2.setVisible(true);  // Show it
                */
          //  }
       // });
    }
}
