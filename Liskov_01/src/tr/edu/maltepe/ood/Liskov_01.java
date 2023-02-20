package tr.edu.maltepe.ood;

import java.util.Vector;

public class Liskov_01 {

    public static void main(String[] args) {

        Vector<Rectangle> rectangles = new Vector<Rectangle>();
        /*
        Rectangle r = new Rectangle(20,10);

        System.out.println("rectangle area is : " + r.getArea());

        Square sq = new Square(20);

        System.out.println("square area is : " + sq.getArea());
      */


        Square r2 = new Square(20);

        r2.setHeight(10);

        Square r3 = new Square(20);
        r3.setHeight(2);

        rectangles.add(r2);
        rectangles.add(r3);

        for (int i=0; i< rectangles.size();i++){
            Rectangle temp;
            temp =  rectangles.elementAt(i);
            System.out.println("square "+i+ " area is : " + temp.getArea());

        }
            }
}
