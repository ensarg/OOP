package edu.maltepe.oop;

public class Vehicle {
    private static int  vehiclecount=0;
    private String vehicle_plate;
    public Vehicle(){
        vehiclecount++;
    }
    public Vehicle(String vehicle_p){
        vehicle_plate=vehicle_p;
        vehiclecount++;
    }

    public void move(){
        System.out.println("Vehicles can move!!");
    }
    public static int getVehiclecount(){
        return  vehiclecount;}
    public void printVehiclePlate(){

        System.out.println("vehicle plate is:"+vehicle_plate);
    }
}
