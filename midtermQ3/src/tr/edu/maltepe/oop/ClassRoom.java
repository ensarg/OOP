package tr.edu.maltepe.oop;
import java.util.ArrayList;
public class ClassRoom {

   private Professor professor;
   private ArrayList<Student> students;

   ClassRoom() {
      this.students = new ArrayList<>();
   }

   public void addProfessor(Professor professor) {
      this.professor = professor;
   }

   public void addStudent(Student student) {
      this.students.add(student);
   }

   public void startLecture() {
      professor.teach(students);
      for (Student student : students) {
         student.listenProf(professor);
         student.askQuestion(professor);
      }
   }

}
