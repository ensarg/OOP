package edu.sehir.oop;

public class Vehicle {
    private static int  vehiclecount=0;
    public Vehicle(){
        vehiclecount++;
    }
    public void move(){  System.out.println("Vehicles can move!!");     	}
    public static int getVehiclecount(){return  vehiclecount;}
}
