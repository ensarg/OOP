package tr.edu.maltepe.oop;

public class JavaBook {

    private String bookname;
    private int number_of_pages;

    public JavaBook(String name, int n) {
        bookname = name;
        number_of_pages=n;
    }

    public void pageNo(int pno) {

        System.out.println("read page " + pno);
    }

    public String getBookname(){
        return bookname;
    }
}