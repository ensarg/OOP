package tr.edu.maltepe.oop;

public class testFactorymethod {

    public static void main(String[] args) {

            ShapeFactory shapeFactory = new ShapeFactory();

            //get an object of Circle and call its draw method.
            Shape shape1 = shapeFactory.getShape("CIRCLE");
            shape1.draw();

            //Rectangle r1= new Rectangle();
            //r1.draw();
            //call draw method of Circle


            //get an object of Rectangle and call its draw method.
            Shape shape2 = shapeFactory.getShape("RECTANGLE");

            //call draw method of Rectangle
            shape2.draw();

            //get an object of Square and call its draw method.
            Shape shape3 = shapeFactory.getShape("SQUARE");

            //call draw method of circle
            shape3.draw();
        }

}
