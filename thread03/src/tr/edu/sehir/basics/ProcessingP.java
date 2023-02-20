package tr.edu.sehir.basics;

public class ProcessingP implements Runnable {
    private String pname;
    Counter mycounter;

    ProcessingP( String name, Counter cc) {
        this.pname = name;
        this.mycounter =cc;

    }

    public void run() {

        try {
            for(int i = 100; i > 0; i--) {
                mycounter.increment();
                // mycounter.decrement();
                // Let the thread sleep for a while.
                Thread.sleep(3);
            }
        } catch (InterruptedException e) {
            System.out.println("P " +  pname + " interrupted.");
        }

    }

}



