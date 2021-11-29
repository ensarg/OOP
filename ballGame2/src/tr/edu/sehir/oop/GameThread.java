package tr.edu.sehir.oop;

public class GameThread extends Thread {
    BallWorld2 bw;
    int updaterate;

    public GameThread(BallWorld2 bw , int updaterate) {   // constructor
        this.bw = bw;
        this.updaterate =updaterate;
    }
    public void run() {
        while (true) {
            // Execute one time-step for the game
            bw.gameUpdate();
            // Refresh the display
            bw.repaint();
            // Delay and give other thread a chance
            try {
                Thread.sleep(1000 / updaterate);
            } catch (InterruptedException ex) {

            }
        }
    }

}
