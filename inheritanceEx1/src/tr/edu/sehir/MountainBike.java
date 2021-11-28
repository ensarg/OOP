package tr.edu.sehir;

public class MountainBike extends Bicycle{

    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startSpeed,
                        int startGear) {
        super(startSpeed, startGear);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public void printH(){
        System.out.println("Bike H:"+seatHeight);

    }

    public void speedUp(int increment) {
        speed = speed + 2*increment;
        System.out.println("new speed mountain bike " +speed);
    }
}
