package tr.edu.maltepe.oop;
// Concrete subclass of Shape
class Circle extends Shape {
   private double radius;
   public Circle(double radius) {
      this.radius = radius;
   }

   // Override the abstract method
   @Override
   public double getArea() {

      return Math.PI * radius * radius;
   }


   public void displayArea() {
      System.out.println("Area of Circle: " + getArea());

   }
}
