package tr.edu.sehir.oop;
import java.util.Vector;

public class SoundManager1 {

    private Vector <Animal1> animalList;

    public SoundManager1(){
        animalList = new Vector <Animal1>();
    }

    public void add(Animal1 a){
        animalList.add(a);
    }
    public void makeSound(){
        for(Animal1 a : animalList)
            if(a instanceof Cat)
                ((Cat) a).mew();
            else if(a instanceof Dog)
                ((Dog) a).bark();
            //else if(a instanceof Bird)
            //    ((Bird) a).birdSing();

    }

}
