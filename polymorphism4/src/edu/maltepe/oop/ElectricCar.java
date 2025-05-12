package edu.maltepe.oop;
class ElectricCar extends Car {

    public void startEngine() {
        System.out.println("ElectricCar starts silently.");
    }

    public void honk(String sound) {
        System.out.println("ElectricCar plays: "+sound);
    }
}