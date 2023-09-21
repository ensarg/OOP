package tr.edu.maltepe.oop;

public class SWEngCourse implements Cloneable {

        String course1;
        String course2;

        public SWEngCourse(String crs1, String crs2)
        {
            this.course1 = crs1;
            this.course2 = crs2;

        }

    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}
