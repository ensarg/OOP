package tr.edu.sehir.oop;

public class SWEngStudent implements Cloneable{



        int stdId;
        String studentName;
        SWEngCourse swengcourses;

        public SWEngStudent(int stdid, String stdName, SWEngCourse coursename)
        {
            this.stdId = stdid;
            this.studentName = stdName;
            this.swengcourses = coursename;
        }

        //Default version of clone() method

        protected Object clone() throws CloneNotSupportedException
        {

            SWEngStudent astd = (SWEngStudent) super.clone();
            astd.swengcourses =(SWEngCourse) swengcourses.clone();
            return astd;
        }

}
