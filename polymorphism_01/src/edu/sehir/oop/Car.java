package edu.sehir.oop;
import java.lang.*;
public class Car extends Vehicle{
    private static int numberofcars=0;
    private float gaslevel=0;
    public Car(){
        numberofcars++;
    }
    public void move(){
        releaseHandBrake();
        pressGasPedal();
        System.out.println("car is moving");
    }

    public void pressGasPedal(){
        gaslevel=gaslevel+5;
    }
    public void releaseHandBrake(){
        System.out.println("handbreak is released");
    }
    public static int getNumberofcars(){
        return numberofcars;
    }

}
