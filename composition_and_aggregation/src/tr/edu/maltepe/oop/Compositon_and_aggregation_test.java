package tr.edu.maltepe.oop;

public class Compositon_and_aggregation_test {
  public static void main(String[] args) {
    CarParkingArea parkingArea = new CarParkingArea();

    Car car1 = new Car("34 ABC 122");
    Car car2 = new Car("34 ABC 123");
    Car car3 = new Car("34 ABC 124");
    Car car4 = new Car("34 ABC 125");

    parkingArea.parkCar(car1);
    parkingArea.parkCar(car2);
    parkingArea.parkCar(car3);

    parkingArea.displayParkedCars();

    parkingArea.unparkCar(car2);

    parkingArea.displayParkedCars();

  }
}