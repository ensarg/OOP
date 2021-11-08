package edu.sehir;

/**
 * Created by ensar on 08.12.2016.
 */
public class BasicCar implements Car  {
    protected BasicCar(){
        System.out.println("Basic Car object is created");
    }


    public void assemble() {
        System.out.print("Basic Car is assembled");
    }
}
