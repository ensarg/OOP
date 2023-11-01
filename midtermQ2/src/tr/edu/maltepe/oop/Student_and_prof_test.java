package tr.edu.maltepe.oop;

public class Student_and_prof_test {

   public static void main(String[] args) {
      Student volkan =new Student("Volkan","Cicek", 20, "123456789", "Computer Engineering");
      Student emre =new Student("Emre","Cicek", 20, "123456788", "Computer Engineering");
      Professor ensar =new Professor("Prof","Cicek", 50, "123456799", "Computer Engineering");
      ensar.teach(volkan);
      ensar.teach(emre);
   }
}
