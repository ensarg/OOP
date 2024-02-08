package tr.edu.sehir.oop;
import java.util.Vector;

public class SoundManager1 {
    private Vector animalList;

    public SoundManager1(){
        animalList = new Vector <>();
    }

    public void add(Animal1 a){
        animalList.add(a);
    }
    public void makeSound(){
        for(Object a : animalList)
            if(a instanceof Cat)
                ((Cat) a).mew();
            else if(a instanceof Dog)
                ((Dog) a).bark();
            else if(a instanceof Bird)
              ((Bird) a).birdSing();

    }

}
