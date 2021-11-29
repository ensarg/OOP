package tr.edu.sehir.oop;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws java.lang.InterruptedException{

        System.out.println("there are "+args.length+ " arguments :");
        while (true) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "] = " + args[i]);
            }
            TimeUnit.SECONDS.sleep(10);
        }

    }
}
