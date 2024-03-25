package tr.edu.maltepe.oop;

public class Bicycle {

    // the Bicycle class has two fields
     private int gear;
     private int speed;
    public Bicycle( int startSpeed, int startGear) {
        gear = startGear;
        speed = startSpeed;
    }
    public Bicycle() {
        gear = 1;
        speed = 0;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("bike: new speed " +speed);
    }
}
