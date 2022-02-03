package tr.edu.sehir.oop;


public class Main {

    public static void main(String[] args) {

        double min =1.0;
        double max = 63.0;
        int i;
        long x,y;
       

        for (i=0; i < 5; i++) {
            x = Math.round((Math.random() * ((max - min) + 1)) + min);
            System.out.println("\n" + x);
        }




        }
    }

