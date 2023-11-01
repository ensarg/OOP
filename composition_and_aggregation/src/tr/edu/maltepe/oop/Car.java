package tr.edu.maltepe.oop;
class Car {
   private Engine engine; // Composition
   private String plate;

   public Car(String plate) {
      this.engine = new Engine();
      this.plate = plate;
   }

   void start() {
      engine.start();
      System.out.println("Car started");
   }

   public String getRegistrationNumber() {
      return plate;
   }
}