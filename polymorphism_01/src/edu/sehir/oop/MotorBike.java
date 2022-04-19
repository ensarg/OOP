package edu.sehir.oop;

public class MotorBike extends Vehicle {
    private  static int numberofmotorbikes=0;
    public MotorBike(){
        System.out.println("a motorbike is produced");
        numberofmotorbikes++;
    }
    public void move(){

        System.out.println("MotorBike can move and accelerate too!!");
    }

    public static int getNumberofmotorbikes(){
        return  numberofmotorbikes;}


}
