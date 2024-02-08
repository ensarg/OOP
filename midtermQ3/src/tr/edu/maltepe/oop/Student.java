package tr.edu.maltepe.oop;

class Student extends Person {
   private int studentId;

   public Student(String name, int age, int studentId) {
      super(name, age);
      this.studentId = studentId;
   }

   public int getStudentId() {
      return studentId;
   }


   public void listenProf(Professor prof) {
      System.out.println(getName() + " is listening to Professor " + prof.getName() + "'s lecture.");
   }

   public void askQuestion(Professor prof) {
      System.out.println(getName() + " is asking a question to Professor " + prof.getName() + ".");
   }
}
