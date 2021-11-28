package tr.edu.sehir.opp;
public class Mammal implements Animal {
    private float weight;
    public void Mammal(float w){
        weight=w;
    }

   public void eat() {
       System.out.println("Mammal eats");
   }


    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }
}
