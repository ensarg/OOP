package tr.edu.maltepe.oop;

public class Test_abstract {
   public static void main(String[] args) {

         //Shape sh =new Shape() ;  you can not create object from abstract class

      // Creating objects of concrete subclasses
         Circle circle = new Circle(5.0);
         Rectangle rectangle = new Rectangle(4.0, 6.0);

         // Using abstract and concrete methods
         //circle.displayArea();
         rectangle.displayArea();
      }

}
