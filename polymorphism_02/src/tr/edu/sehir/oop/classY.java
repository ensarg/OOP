package tr.edu.sehir.oop;

public class classY extends classX{
    private int c; // new instance variable of class Y
    public void m1(){
        // overriden method
        System.out.println("This is method m1 of class classY");
    }
    public void m2(){
        super.m1();
        System.out.println("This is method m2 of class classY");
    }
}
