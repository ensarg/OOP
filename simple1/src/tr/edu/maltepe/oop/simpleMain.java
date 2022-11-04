package tr.edu.maltepe.oop;

public class simpleMain {

  public static void main(String[] args) {

    int x;
    OOPStudent s1, s2;
    JavaBook ajavabook, anotherjavabook;
    MaltepeLibrary mylib;

    mylib = new MaltepeLibrary();

    ajavabook = new JavaBook("essential java", 500);
    anotherjavabook = new JavaBook("intro java prog", 300);

    mylib.add_book(ajavabook);
    mylib.add_book(anotherjavabook);

    mylib.list_books();

    s1 = new OOPStudent();

    s1.readBook(ajavabook);

    /*
            s1.setId(32344);

            s2 = new Student();

            s2.setId(22456);

            s1.printStdId();
            s2.printStdId();

            x= s1.getId();

            System.out.println(" stddent id is:"+x);


            int y=s1.getId();

            System.out.println(" stddent id is:"+y);

           // System.out.println(" s1 converted to string:"+s1.toString());
           // System.out.println(" s2 converted to string:"+s2.toString());

            OOPStudent s3 = new OOPStudent();

            s3.setId(87657);


            System.out.println(" oop student id is:"+s3.getId());

            s3.learnJava();

            s3.learnJava("OOP Programming");


            Student s4 = new Student("gamze");

            System.out.println(" student name is:"+s4.gretName());

            Student s5 = new Student(12345);

            System.out.println(" student5 id is:"+s5.getId());


    */

  }
}
