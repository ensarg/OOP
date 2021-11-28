package tr.edu.sehir.basics;

public class Rectangle implements myShape {

    private double width;
    private double height;

    public Rectangle(double w, double h){
        this.width=w;
        this.height=h;
    }

    public void draw() {
        System.out.println("Drawing Rectangle");
    }


    public double getArea() {
        return this.height*this.width;
    }









}
