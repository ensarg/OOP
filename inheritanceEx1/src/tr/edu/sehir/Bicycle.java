package tr.edu.sehir;

public class Bicycle {

    // the Bicycle class has two fields

     int gear;
     int speed;

    // the Bicycle class has two constructors

    public Bicycle( int startSpeed, int startGear) {
        gear = startGear;
        speed = startSpeed;
    }



    // the Bicycle class has three methods

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("new speed " +speed);
    }
}
