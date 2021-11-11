package tr.edu.sehir.oop;

public class MyClass {

    private int x,y;
    /*
    public MyClass(int a, int b){
        x=a;
        y=b;

        System.out.println("MyClass object is created now");
    }

*/

    public MyClass(){
        x=5;
        y=6;

        System.out.println("MyClass object is created now");
    }


    public void sayHello() {
        System.out.println("Hello  from the loaded class !!!");
    }

    public void sayMerhaba() {
        System.out.println("Merhaba from the loaded class !!!");
    }

    public void calculate_example() {

        int z=x*y;
        System.out.println("calculate_example method is called from loaded class. z="+z);
    }

}