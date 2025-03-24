package tr.edu.maltepe.oop;

public class ShallowCopyTest {

    public static void main(String[] args) {


        SWEngCourse courses = new SWEngCourse("OP Sys", "OOP");

        SWEngStudent std1 = new SWEngStudent(2019123, "Emre", courses);

        SWEngStudent std2 = null;


        std2=std1;

        //Printing Details of student1
        System.out.println("Details of Student 1: ");
        System.out.println("Id: "+std1.getStdId());
        System.out.println("Name: "+std1.getStudentName());
        System.out.println("Course name: "+std1.getSwengcourses().getCourse1());


        //Printing Details of student2
        System.out.println("Details of Student 2: ");
        System.out.println("Id: "+std2.getStdId());
        System.out.println("Name: "+std2.getStudentName());
        System.out.println("Course name: "+std2.getSwengcourses().getCourse1());

        //Printing all the courses of 'student2'
        System.out.println("Courses of stdudent 2: ");
        System.out.println(std2.getStudentName());
        System.out.println(std2.getSwengcourses().getCourse2());


        //Changing the course3 of 'student 22'
        std2.setStudentName("Elif");
        std2.getSwengcourses().setCourse1( "Physics");

        //This change will be reflected in original stdudent1'
        System.out.println("Updated Courses of std1:");
        System.out.println(std1.getStudentName());
        System.out.println(std1.getSwengcourses().getCourse1());
        System.out.println(std1.getSwengcourses().getCourse2());




        System.out.println("\n---------------------------------------------------- ");

        try {
            //Creating a clone of student1 and assigning it to student2
            std2 = (SWEngStudent) std1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }


        //Printing Details of student1
        System.out.println("Details of Student 1: ");
        System.out.println("Id: "+std1.getStdId());
        System.out.println("Name: "+std1.getStudentName());
        System.out.println("Course name: "+std1.getSwengcourses().getCourse1());
        System.out.println("Course name: "+std1.getSwengcourses().getCourse2());


        //Printing Details of student2
        System.out.println("Details of Student 2: ");
        System.out.println("Id: "+std2.getStdId());
        System.out.println("Name: "+std2.getStudentName());
        System.out.println("Course name: "+std2.getSwengcourses().getCourse1());
         System.out.println("Course name: "+std2.getSwengcourses().getCourse2());

        //Printing all the courses of 'student2'
       // System.out.println("Courses of stdudent 2: ");
       // System.out.println(std2.swengcourses.course1);
        //System.out.println(std2.swengcourses.course2);


        //Changing the course3 of 'student 22'

        std2.setStudentName("MeRT");
        std2.getSwengcourses().setCourse1( "Physics");
        std2.getSwengcourses().setCourse2( "Math");

        //This change will be reflected in original stdudent1'
        System.out.println("Updated names and courses :------------------------------------");
        System.out.println("student 1 name: "+std1.getStudentName());
        System.out.println("std1 course1 "+std1.getSwengcourses().getCourse1());
        System.out.println("std1 course2 "+std1.getSwengcourses().getCourse2());

         System.out.println("student 2 name: "+std2.getStudentName());
        System.out.println("std2 course1 "+std2.getSwengcourses().getCourse1());
         System.out.println("std2 course2 "+std2.getSwengcourses().getCourse2());

        */

    }




}
