package edu.maltepe.oop;

import java.util.Random;
import java.util.Vector;

public class testPolymorphism_1 {

    public static void main(String[] args) {

        Vector v = new  Vector(10);

        Random rand=new Random();

        Vehicle  vh;
        //Vehicle vh1,vh2,vh3;


        //vh1= new MotorBike("34-ABC-456");
        //v.add(vh1);
        //vh1.move();

        //vh3 =new MotorBike("34-XYZ-123");
        //vh3.move();
        //v.add(vh3);

        //vh2=new Car();
        //vh2.move();
       // v.add(vh2);
       /*
        for (int i=0;i < v.size();i++) {
            vh =  (Vehicle)v.get(i);
            vh.move();
        }
        */


        for (int i=0; i< 10;i++) {
            int r=rand.nextInt(2);
            if (r==0){
                vh=new MotorBike(" 34 Motorbike "+i);
                v.add(vh);
                }
            else if (r==1)
                v.add(new Car(" 34 Car "+i));
            else
                System.out.println("\nimpsosible case");

        }

        for (int i=0;i < v.size();i++) {
            vh =  (Vehicle)v.get(i);
            vh.move();
        }

        System.out.println("\ncar count:"+Car.getNumberofcars());
        System.out.println("\nmotorbike count:"+MotorBike.getNumberofmotorbikes());
        System.out.println("\nvehicle count:"+Vehicle.getVehiclecount());
        /*
        System.out.println("\nvehicle plates.................................\n");

        for (int i=0;i < v.size();i++) {
            vh =  (Vehicle)v.get(i);
            vh.printVehiclePlate();
        }
        */
        /*
        for (int i=0;i < v.size();i++) {

            vh =  (Vehicle)v.get(i);
            vh.move();
        }
      */
    }
}
