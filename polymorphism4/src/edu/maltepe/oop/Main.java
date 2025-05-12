package edu.maltepe.oop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new ElectricCar();
        v1.startEngine();
        v2.startEngine();
        v1.honk();
        v2.honk();  // What happens here?
        }
    }
