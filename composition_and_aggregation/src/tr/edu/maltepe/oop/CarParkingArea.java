package tr.edu.maltepe.oop;

import java.util.ArrayList;
import java.util.List;

class CarParkingArea {
   private List<Car> parkedCars = new ArrayList<>(); // Composition

   public void parkCar(Car car) {
      parkedCars.add(car);
      System.out.println("Car with registration number " + car.getRegistrationNumber() + " parked in the area.");
   }
   public void unparkCar(Car car) {
      parkedCars.remove(car);
      System.out.println("Car with registration number " + car.getRegistrationNumber() + " unparked from the area.");
   }

   public void displayParkedCars() {
      System.out.println("Cars parked in the area:");
      for (Car car : parkedCars) {
         System.out.println(car.getRegistrationNumber());
      }
   }
}



