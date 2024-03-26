package tr.edu.maltepe.opp;

public class Main {

    public static void main(String[] args) {

        Circle c = new Circle(10);

        c.draw();
        System.out.println("Area="+c.getArea());

        //switching from one implementation to another easily
        Rectangle rr=new Rectangle(10,10);
        rr.draw();
        System.out.println("Area="+rr.getArea());

       // myShape m2 = new myShape(); // you can't create an instance of an interface


}
}
