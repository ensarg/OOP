package tr.edu.sehir.basics;

public class Dog extends Animal {

    private int id;

    static  int numberOfDogs = 0;

    public Dog(){
        id = ++numberOfDogs;
    }
    @Override
    public void speak() {

        bark();
    }
    public void bark(){

        System.out.println("Woof !");
    }

    public int getID() {
        return id;
    }

    public static int getNumberOfDogs() {


        return numberOfDogs);
    }



}
