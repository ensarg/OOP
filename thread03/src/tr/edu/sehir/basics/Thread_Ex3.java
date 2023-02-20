package tr.edu.sehir.basics;

public class Thread_Ex3 {

    public static void main(String[] args) throws InterruptedException {

        Counter cc = new Counter();

        ProcessingP pt1 = new ProcessingP( "Processing P1",cc);
        ProcessingP pt2 = new ProcessingP( "Processing P2",cc);
        ProcessingP pt3 = new ProcessingP( "Processing P3",cc);
        ProcessingP pt4 = new ProcessingP( "Processing P4",cc);

        Thread t1 = new Thread(pt1, "t1");
        Thread t2 = new Thread(pt2, "t2");
        Thread t3 = new Thread(pt3, "t3");
        Thread t4 = new Thread(pt4, "t3");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        //wait for threads to finish processing
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println("counter="+cc.getValue());
    }
}
