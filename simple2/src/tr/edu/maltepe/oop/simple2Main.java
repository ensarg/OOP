package tr.edu.maltepe.oop;

public class simple2Main {

    public static void main(String[] args) {

        Professor p1,p2;

        Student s1,s2;

        p1=new Professor();
        p1.teaches();

        //p2=new Professor("raif hoca");
        //p2.teaches();

        //s1 = new Student(255);

        s2 =new Student(255, "ali");
        //s2.introduce();
        s2.playfootball();

        p1.swim();


    }
}
