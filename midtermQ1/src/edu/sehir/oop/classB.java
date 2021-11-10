package edu.sehir.oop;

public class classB {

    private classA a ;
    private int k;

    public int getK() { return k; }

    public void setK(int k) { this.k = k; }

    public void do_something(classA a) {
        a.amethod();
    }


}
