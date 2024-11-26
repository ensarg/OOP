package tr.edu.maltepe.oop;
class Car {
   private Engine engine; // Car has an Engine
   private Tyre[] tyres;

   public Car(Tyre[] tyres) {

      engine = new Engine("V8", 350, "Gasoline"); // Initialize Engine object
      this.tyres = tyres;
   }

   public void startCar() {
      engine.start(); // Delegate start operation to Engine object
   }

   public void stopCar() {
      engine.stop(); // Delegate stop operation to Engine object
   }
}
