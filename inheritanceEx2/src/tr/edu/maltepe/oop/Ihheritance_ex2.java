package tr.edu.maltepe.oop;
public class Ihheritance_ex2 {
    public static void main(String[] args) {

        Cat cat = new Cat("Tekir");
        System.out.println("Cat name: " + cat.getCatName());
        cat.speak();
    }
}