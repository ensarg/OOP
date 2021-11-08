package edu.sehir;

public class Main {

    public static void main(String[] args) {

            Car basicCar = new BasicCar();
            Car sportsCar = new SportsCar(basicCar);
            sportsCar.assemble();
            System.out.println("\n*****");

            //Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
            //sportsLuxuryCar.assemble();

    }
}
