package tr.edu.maltepe.oop;

public class Tyre {
    private String brand;

    public Tyre(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void roll() {
        System.out.println("Tyre of brand " + brand + " is rolling...");
    }
}
