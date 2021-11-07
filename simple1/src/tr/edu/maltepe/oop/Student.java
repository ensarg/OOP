package tr.edu.maltepe.oop;

public class Student {

    private int stdid;
    private String name;

    public Student (){
        stdid=0;
    }

    public Student(String stdname){

        name=stdname;

    }

    public Student(int id){
        stdid =id;
    }

    int getId(){
        return stdid;
    }

    String gretName(){
        return name;
    }
    void setId(int id){
        stdid =id;
    }

    public void printStdId(){
        System.out.println("student id:"+getId());

    }
}


// java.lang.object  --- Student