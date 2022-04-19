package tr.edu.sehir.basics;

public class Main {

    public static void main(String[] args) {

        Circle c = new Circle(10);

        c.draw();
        System.out.println("Area="+c.getArea());

        //switching from one implementation to another easily
        shape=new Rectangle(10,10);
        shape.draw();
        System.out.println("Area="+shape.getArea());
    }
}
