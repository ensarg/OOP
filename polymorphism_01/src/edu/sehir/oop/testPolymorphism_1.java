package edu.sehir.oop;

import java.util.Random;
import java.util.Vector;


public class testPolymorphism_1 {

    public static void main(String[] args) {

        Vector v = new  Vector();
        Random rand=new Random();

        Vehicle  vh,vh1,vh2,vh3;
        /*
        vh1= new MotorBike();
        v.add(vh1);

        vh2=new Car();
        v.add(vh2);
        */


        for (int i=0; i< rand.nextInt(10);i++) {
            int r=rand.nextInt(2);
            if (r==0)
                v.add(new MotorBike());
            else if (r==1)
                v.add(new Car());
            else
                System.out.println("\nimpsosible case");

        }


        System.out.println("\ncar count:"+Car.getNumberofcars());
        System.out.println("\nmotorbike count:"+MotorBike.getNumberofmotorbikes());
        System.out.println("\nvehicle count:"+Vehicle.getVehiclecount());

        for (int i=0;i < v.size();i++) {

            vh =  (Vehicle)v.get(i);
            vh.move();
        }

    }
}
