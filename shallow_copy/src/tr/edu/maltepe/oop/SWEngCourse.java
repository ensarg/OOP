
package tr.edu.maltepe.oop;
public class SWEngCourse {

   private String course1;
   private String course2;

   public SWEngCourse(String crs1, String crs2)
   {
      this.course1 = crs1;
      this.course2 = crs2;
   }

   public String getCourse1() {
      return course1;
   }
   public void setCourse1(String course1) {
      this.course1 = course1;
   }

   public String getCourse2() {
      return course2;
   }
   public void setCourse2(String course2) {
      this.course2 = course2;
   }
}
