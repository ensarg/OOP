package tr.edu.maltepe.oop;

import java.util.Vector;

public class MaltepeLibrary {

  private final Vector books;

  public MaltepeLibrary() {
    books = new Vector();
  }

  public void add_book(JavaBook abook) {
    books.add(abook);
  }

  void list_books() {
    System.out.println("\nname of the books");

    for (int i = 0; i < books.size(); i++) {
      JavaBook temp = (JavaBook) books.get(i);
      System.out.println(temp.getBookname());
    }
  }
}
