package tr.edu.sehir.basics;

public class Main {

    public static void main(String[] args) {

        myShape shape = new Circle(10);

        shape.draw();
        System.out.println("Area="+shape.getArea());

        //switching from one implementation to another easily
        shape=new Rectangle(10,10);
        shape.draw();
        System.out.println("Area="+shape.getArea());
    }
}
