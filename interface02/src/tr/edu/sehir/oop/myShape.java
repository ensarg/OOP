package tr.edu.sehir.oop;

public interface myShape {

    //implicitly public, static and final
    public String LABLE="Shape";

    //interface methods are implicitly abstract and public
   public void draw();

    double getArea();
}
