package tr.edu.maltepe.oop;

public class Student {

    private int stdid;
    private String name;

    public Student (){
        stdid=0;
    }

    public Student(String stdname){
        this.name=stdname;
    }

    public void Student(int id){
        stdid =id;
    }

    public int getId(){
        return stdid;
    }

    public String getName(){
        return name;
    }
    public void setId(int id){
        stdid =id;
    }

    public void printStdId(){
        System.out.println("student id:"+getId());

    }
}


// java.lang.object  --- Student