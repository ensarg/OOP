package tr.edu.sehir.oop;

import java.util.Vector;

public class SoundManager2 {
    private Vector<Animal2> animalList;

    public SoundManager2(){
        animalList = new Vector <Animal2>();
    }

    public void add(Animal2 a){
        animalList.add(a);
    }
    public void makeSound() {
        for (Animal2 a : animalList)
            a.makeSound();
    }
}
