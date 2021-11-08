package edu.sehir.oop;

/**
 * Created by ensar on 08.12.2016.
 */
public class SportsCar extends CarDecorator {
    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}
