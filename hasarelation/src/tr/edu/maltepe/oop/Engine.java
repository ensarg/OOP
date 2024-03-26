package tr.edu.maltepe.oop;
class Engine {
   private String engineType;
   private int horsepower;
   private String fuelType;

   // Constructor
   public Engine(String engineT, int horsepower, String fuelType) {
      this.engineType = engineT;
       this.horsepower = horsepower;
      this.fuelType = fuelType;
   }

   public void start() {
      System.out.println("Engine started. Type: " + engineType + ", Horsepower: " + horsepower + ", Fuel: " + fuelType);
   }

   public void stop() {

      System.out.println("Engine stopped");
   }

   // Getters and setters
   public String getEngineType() {
      return engineType;
   }

   public void setEngineType(String engineType) {
      this.engineType = engineType;
   }

   public int getHorsepower() {
      return horsepower;
   }

   public void setHorsepower(int horsepower) {
      this.horsepower = horsepower;
   }

   public String getFuelType() {
      return fuelType;
   }

   public void setFuelType(String fuelType) {
      this.fuelType = fuelType;
   }
}
