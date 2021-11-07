package tr.edu.maltepe.oop;

public class JavaBook {

    private String bookname;

    public JavaBook(String name) {
        bookname = name;
    }


    public void pageNo(int pno) {

        System.out.println("read page " + pno);
    }
}