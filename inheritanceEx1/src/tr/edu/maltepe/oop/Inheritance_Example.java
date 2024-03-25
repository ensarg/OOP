package tr.edu.maltepe.oop;

public class Inheritance_Example {

    public static void main(String[] args) {


        Bicycle mybike = new Bicycle(10,4);

        Bicycle aylinsbike =new Bicycle();

       // Bicycle yourbike2 = new Bicycle(5,1);


        MountainBike yourbike = new MountainBike(100,10,1);


        mybike.speedUp(2);

        aylinsbike.speedUp(3);

        yourbike.speedUp(2);

        System.out.println("yourbike gear is: "+yourbike.getGear());
        System.out.println("yourbike speed is: "+yourbike.getSpeed());


        System.out.println("-----------------");

         // yourbike =   mybike; //??????
       //  yourbike.speedUp(2);  //calls the method of parent class

        //yourbike.printH();

       /*
        System.out.println("-----------------");
        mybike = yourbike;
        mybike.speedUp(4);  //calls the method of child class

        //yourbike.setGear(4);
         */


    }
}
