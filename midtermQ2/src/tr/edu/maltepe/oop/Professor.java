package tr.edu.maltepe.oop;

public class Professor extends Person{
      private String professorId;
      private String department;

      public Professor(String name, String surname, int age, String professorId, String department) {
         super(name, surname, age);
         this.professorId = professorId;
         this.department = department;
      }
      public Professor (String name, String surname, int age, String professorId) {
         super(name, surname, age);
         this.professorId = professorId;
         this.department = "Software Engineering";
      }

      void inLecture() {
         System.out.println("Professor " + this.getName() + " is lecturing.");
      }

      public String getProfessorId() {
         return professorId;
      }

      public String getDepartment() {
         return department;
      }

      public void setProfessorId(String professorId) {
         this.professorId = professorId;
      }

      public void setDepartment(String department) {
         this.department = department;
      }

      public void print() {
         super.print();
         System.out.println("Professor ID: " + professorId + " Department: " + department);
      }

      public void teach( Student astudent) {
         astudent.listen_lecture();
         System.out.println("Professor " + this.getName() + " is teaching.");
      }

}
