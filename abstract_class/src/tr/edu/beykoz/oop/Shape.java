package tr.edu.beykoz.oop;

public abstract class Shape {
      // Abstract method (no method body)
      public abstract double getArea();
      // abstract method
      public  abstract void draw();

      public void displayArea() {
         System.out.println("Area of shape: " + getArea());
      }
}



