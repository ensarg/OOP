package tr.edu.sehir.basics;

public class Counter {
         private static int c = 0;
        public   synchronized void   increment() {
            c++;
        }

        public  synchronized   void decrement() {
           c--;
        }

        public int getValue() {
            return c;
        }
}
