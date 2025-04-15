package tr.edu.maltepe.opp;

public class Rectangle implements myShape {
  private final double width;
  private final double height;
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  public void draw() {
    System.out.println("Drawing Rectangle");
  }

  public double getArea() {

    return this.width * this.height;
  }
}
