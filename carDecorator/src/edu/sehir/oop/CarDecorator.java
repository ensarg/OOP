package edu.sehir.oop;

/**
 * Created by ensar on 08.12.2016.
 */
public class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car c){
        car=c;
    }

    @Override
    public void assemble() {
        car.assemble();
    }

}
