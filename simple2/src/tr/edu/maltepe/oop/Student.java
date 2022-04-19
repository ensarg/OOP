package tr.edu.maltepe.oop;
public class Student extends Person implements doSport {

    String std_name;
    int std_id;

    Student(int id, String name){
        std_id=id;
        std_name=name;

    }

    public void introduce(){
        System.out.println("this method is overriding the parent method");
        System.out.println("name"+name);

    }
    void learns(){

    }

    public void playfootball(){
        System.out.println("playing football");

    }

    public void swim(){
        System.out.println("swimming");

    }
}
