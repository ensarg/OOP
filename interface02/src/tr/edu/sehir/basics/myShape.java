package tr.edu.sehir.basics;

public interface myShape {

    //implicitly public, static and final
    public String LABLE="Shape";

    //interface methods are implicitly abstract and public
    void draw();

    double getArea();
}
