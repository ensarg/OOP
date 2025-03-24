package tr.edu.maltepe.oop;

public class HasRelMain {
   public static void main(String[] args) {

      Tyre[] carTyres = {
              new Tyre("GoodYear"),
              new Tyre("Michelin"),
              new Tyre("Michelin"),
              new Tyre("Michelin")
      };
      Car myCar = new Car(carTyres); // Create Car object

      // Start and stop the car
      myCar.startCar();
      myCar.stopCar();
   }
}
