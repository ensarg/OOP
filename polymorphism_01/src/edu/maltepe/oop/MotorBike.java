package edu.maltepe.oop;

public class MotorBike extends Vehicle {
    private  static int numberofmotorbikes=0;
    private String motorbike_brand;

    public MotorBike( String motorbike_plate){
        super(motorbike_plate);
        System.out.println("a motorbike is produced");
        numberofmotorbikes++;
    }

    public void move(){

        System.out.println("MotorBike can move and accelerate too!!");
    }

    public static int getNumberofmotorbikes(){
        return  numberofmotorbikes;}


}
