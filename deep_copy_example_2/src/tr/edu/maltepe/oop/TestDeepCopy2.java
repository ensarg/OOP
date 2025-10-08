package tr.edu.maltepe.oop;
import java.util.ArrayList;

public class TestDeepCopy2 {

public static void main(String[] args) {
   Book b1 = new Book("Book 1", "Author 1");
   Book b2 = new Book("Book 2", "Author 2");
   Book b3 = new Book("Book 3", "Author 3");
   // Create a deep copy of the library
   ArrayList<Book> mybooks = new ArrayList<>();
   Library library = new Library(mybooks);
   library.addBook(b1);
   library.addBook(b2);
   library.addBook(b3);
   System.out.println("Original Library:");
   library.printBooks();
   Library libraryCopy = library.deepCopy();
   System.out.println("Copied Library:");
   libraryCopy.printBooks();

   library.removeBook(b1);
   //libraryCopy.addBook(new Book("Book 4", "Author 4"));
   System.out.println("Original Library after modification:");
   library.printBooks();
   System.out.println("Copied Library:");
   libraryCopy.printBooks();
   // The copied library should not be affected by the changes in the original library

   Library libraryShallowCopy = library.shallowCopy();
   System.out.println("Shallow Copied Library:");
   libraryShallowCopy.printBooks();
   libraryShallowCopy.addBook(new Book("Book 4", "Author 4"));
   System.out.println("Original Library after modification:");
   library.printBooks();
   System.out.println("Shallow Copied Library:");
   libraryShallowCopy.printBooks();
}
}
