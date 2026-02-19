package tr.edu.maltepe.oop;

public class Book {
    int id;
    String name;
    Book (int id, String name){
        this.id=id;
        this.name=name;
    }
      public int getId() {
         return id;
      }
      public String getName() {
         return name;
      }
      public void setId(int id) {
         this.id = id;
      }
      public void setName(String name) {
         this.name = name;
      }

      public String toString() {

       return "Book [id=" + getId() + ", name=" + name + "]";
      }

}
