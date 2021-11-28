package tr.edu.sehir.basics;

public class Thread_Ex1 {

    public static void main(String[] args) {

         Thread t1 = new MyThread("Thread 1");
         Thread t2 = new MyThread("Thread 2");
         Thread t3 = new MyThread("Thread 3");
         Thread t4 = new MyThread("Thread 4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
