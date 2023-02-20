package tr.edu.sehir.oop;

public class Main {

    public static void main(String[] args) {

        SoundManager1 s1 = new SoundManager1();
        Cat c1 = new Cat();
        Dog d1 = new Dog();
       Bird b1 = new Bird();
        s1.add(c1);
        s1.add(d1);
        s1.add(b1);
        s1.makeSound();

        //-----------------------
        System.out.println("Using SoundManager2 \n");
        SoundManager2 s2 = new SoundManager2();
        Cat2 c2 = new Cat2();
        Dog2 d2 = new Dog2();
        // Bird b1 = new Bird();
        s2.add(c2);
        s2.add(d2);
        // s2.add(b2);
        s2.makeSound();

    }
}
