package tr.edu.maltepe.oop;
public class SWEngStudent implements Cloneable{
        private int stdId;
        private String studentName;
        private SWEngCourse swengcourses;

        public SWEngStudent(int stdid, String stdName, SWEngCourse coursename)
        {
            this.stdId = stdid;
            this.studentName = stdName;
            this.swengcourses = coursename;
        }

        //Default version of clone() method

        protected Object clone() throws CloneNotSupportedException
        {
            return super.clone();
        }

   public int getStdId() {
      return stdId;
   }

   public void setStdId(int stdId) {
      this.stdId = stdId;
   }

   public String getStudentName() {
      return studentName;
   }

   public void setStudentName(String studentName) {
      this.studentName = studentName;
   }

   public SWEngCourse getSwengcourses() {
      return swengcourses;
   }

   public void setSwengcourses(SWEngCourse swengcourses) {
           this.swengcourses = swengcourses;
   }

}
