package tr.edu.maltepe.oop;
class Rectangle extends Shape {
   private double width;
   private double height;

   public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
   }
   // Override the abstract method
   @Override
   public double getArea() {
      return width * height;
   }




   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }




}
