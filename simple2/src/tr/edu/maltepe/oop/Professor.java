package tr.edu.maltepe.oop;

public class Professor extends Person implements doSport{
    private  String prof_name;

    public void teaches(){

        System.out.println("prof "+prof_name+" is teaching now");


    }

    @Override
    public void playfootball() {
        System.out.println("prof can also play football");

    }

    @Override
    public void swim() {
        System.out.println("prof can also swim");

    }
}
