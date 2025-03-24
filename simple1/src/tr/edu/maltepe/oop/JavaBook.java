package tr.edu.maltepe.oop;

public class JavaBook {
    private String bookname;
    private int number_of_pages;

    public JavaBook(String name, int n) {
        bookname = name;
        number_of_pages=n;
    }

    public void displaypNo(int pno) {

        System.out.println("read page " + pno);
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }


    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public String getBookname(){
        return bookname;
    }
}