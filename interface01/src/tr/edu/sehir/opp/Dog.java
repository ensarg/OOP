package tr.edu.sehir.opp;

public class Dog extends AbstractAnimal {
  private int speed;

  public void Dog(int sp) {
    speed = sp;
  }

  public void eat() {
    //you will have more lines
    System.out.println("Dog eats");
  }

  public void travel() {
    System.out.println("Dog travels");
  }
  public void bark() {
    System.out.println("Dog barks");
  }
}
