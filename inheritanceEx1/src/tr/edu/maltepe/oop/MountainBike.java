package tr.edu.maltepe.oop;

public class MountainBike extends Bicycle{
    // the MountainBike subclass adds one field
    private int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight, int startSpeed, int startGear) {
        super(startSpeed, startGear);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public int getHeight() {
        return seatHeight;
    }

    public void printBikeProperties(){

        System.out.println("Bike H:"+seatHeight+"gear:"+getGear());
    }

    public void speedUp(int increment) {
        //super.speedUp(increment);
        int tempsps = getSpeed();

        tempsps = tempsps + 2*increment;
        System.out.println("mountain bike: new speed " +tempsps);
    }
}
