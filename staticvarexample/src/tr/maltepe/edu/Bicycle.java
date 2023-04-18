package tr.maltepe.edu;

public class Bicycle {
   // static variable for number of bicycles
   private static int numberOfBicycles = 0;

   // instance variables
   private String color;
   private int gear;

   // constructor
   public Bicycle(String color, int gear) {
      ++numberOfBicycles;
      this.color = color;
      this.gear = gear;
   }

   // instance methods
   public void ride() {
      System.out.println("Riding bicycle " );
   }

   public void changeGear(int newGear) {
      this.gear = newGear;
      System.out.println("Changed gear to " + newGear);
   }

   // static method to get number of bicycles

   public static int getNumberOfBicycles() {
      return numberOfBicycles;
   }
}
