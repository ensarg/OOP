package tr.edu.sehir.oop;

public class Main {

    public static void main(String[] args) {
        classX x = new classX();
        classY y = new classY();

        y.m2();


        x.m1();

        y.m1();


        x = y;// parent pointing to object of child

        x.m1() ;
        //y.c=10;
        /**/
    }
}
