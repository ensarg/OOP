package tr.edu.sehir.oop;

public class Professor {
    //String name;
    //Student  s1;
    Professor(){
        System.out.println("prof object is created");
    }
    void  talk( Student s1){
        System.out.println("prof is talking");
        s1.listen();
    }
}
