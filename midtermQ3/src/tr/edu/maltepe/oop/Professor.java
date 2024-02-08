package tr.edu.maltepe.oop;

import java.util.ArrayList;

class Professor extends Person {
   private String expertise;
   private String officeLocation;

   Professor(String name, int age, String expertise, String officeLocation) {
      super(name, age);
      this.expertise = expertise;
      this.officeLocation = officeLocation;
   }

   public String getExpertise() {
      return expertise;
   }

   public String getOfficeLocation() {
      return officeLocation;
   }

   public void teach( ArrayList<Student> students) {
      for (Student student : students) {
         System.out.println(getName() + " is teaching to  "+student.getName());
      }
   }
}
