package tr.edu.maltepe.oop;

import java.util.ArrayList;

public class Library {
   ArrayList<Book> books;

   Library(ArrayList<Book> books) {
      this.books = books;
   }
   public void addBook(Book book) {
      books.add(book);
   }
   public void removeBook(Book book) {
      books.remove(book);
   }
   public void printBooks() {
      for (Book book : books) {
         System.out.println("Title: " + book.title + ", Author: " + book.author);
      }
   }
   public Library deepCopy() {
      ArrayList<Book> copiedBooks = new ArrayList<>();
      for (Book book : books) {
         copiedBooks.add(new Book(book.title, book.author));
      }
      return new Library(copiedBooks);
   }
   public Library shallowCopy() {
      return new Library(books);
   }



}
