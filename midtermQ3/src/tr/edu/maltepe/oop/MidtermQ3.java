package tr.edu.maltepe.oop;
public class MidtermQ3 {
   public static void main(String[] args) {
      Professor professor = new Professor("Dr. Arslan", 40, "Computer Science", "Room 101");
      Student student1 = new Student("Ali", 20, 1001);
      Student student2 = new Student("Bahadır", 21, 1002);
      Student student3 = new Student("Ayşe", 21, 1002);
      ClassRoom classRoom = new ClassRoom();
      classRoom.addProfessor(professor);
      classRoom.addStudent(student1);
      classRoom.addStudent(student2);
      classRoom.addStudent(student3);

      classRoom.startLecture();

   }
}
