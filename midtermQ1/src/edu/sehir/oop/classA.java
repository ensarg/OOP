package edu.sehir.oop;

public class classA {
    private int n;
    public int m;

    public classA(int n, int m) {  this.n=n;this.m=m;  }

    public void setM(int m) { this.m = m; }

    public void setN(int n) { this.n = n; }

    public int getM() { return m; }

    public int getN() { return n; }

    public void amethod() {
        System.out.println(" m : "+getM() +" and n: " +getN());
    }
}
