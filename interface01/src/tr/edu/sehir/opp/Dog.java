package tr.edu.sehir.opp;

public class Dog extends Mammal {
  private int speed;

  public void Dog(int sp) {
    speed = sp;
  }

  public void bark() {
    System.out.println("Dog barks");
  }
}
