package tr.edu.maltepe.oop;

public class OOPStudent extends Student {


    public void learnJava(){

        System.out.println(" OOP student learns java ");
    }

    public void learnJava(String bookname){

        System.out.println(" OOP student learns java using the book "+ bookname);

    }


    public void readBook(JavaBook abook){

        abook.pageNo(100);

    }

}
