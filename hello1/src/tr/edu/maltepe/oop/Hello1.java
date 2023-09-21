package tr.edu.maltepe.oop;

public class Hello1{

    public static void main(String[] args) {

       Counter c1,c2;

       c1 = new Counter();
       c2 = new Counter(5);
       c1.icrement();
       //c1.icrement();

       c2.icrement();
       c2.icrement();

        System.out.println("counter = "+c1.getCount());
        System.out.println("counter2 = "+c2.getCount());

        //System.out.println("counter2 = "+c2.count);


        //System.out.println("\n hello again");
    }
}
