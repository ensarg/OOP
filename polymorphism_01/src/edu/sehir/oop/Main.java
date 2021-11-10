package edu.sehir.oop;
import java.util.Vector;


public class Main {

    public static void main(String[] args) {
        Vector v = new  Vector();

        Vehicle  vh = new MotorBike();
        v.add(vh);

        vh=new Vehicle();
        v.add(vh);

        for (int i=0;i < v.size();i++) {

            vh =  (Vehicle)v.get(i);
            vh.move();
        }

    }
}
