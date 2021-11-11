package tr.edu.maltepe.oop;

public class ShallowCopyTest {

    public static void main(String[] args) {


        SWEngCourse courses = new SWEngCourse("OP Sys", "OOP");

        SWEngStudent std1 = new SWEngStudent(2019123, "Ahmet", courses);

        SWEngStudent std2 = null;

        /*
        std2=std1;

        //Printing Details of student1
        System.out.println("Details of Student 1: ");
        System.out.println("Id: "+std1.stdId);
        System.out.println("Name: "+std1.studentName);
        System.out.println("Course name: "+std1.swengcourses);

        //Printing all the courses of 'student1'
        System.out.println("Courses of student 1: ");
        System.out.println(std1.swengcourses.course1);
        System.out.println(std1.swengcourses.course2);

        //Printing Details of student2
        System.out.println("Details of Student 2: ");
        System.out.println("Id: "+std2.stdId);
        System.out.println("Name: "+std2.studentName);
        System.out.println("Course name: "+std2.swengcourses);

        //Printing all the courses of 'student2'
        System.out.println("Courses of stdudent 2: ");
        System.out.println(std2.swengcourses.course1);
        System.out.println(std2.swengcourses.course2);

        //Changing the course3 of 'student 22'
        std2.studentName="Mehmet";
        std2.swengcourses.course2 = "Physics";

        //This change will be reflected in original stdudent1'
        System.out.println("Updated Courses of std1:");
        System.out.println(std1.studentName);
        System.out.println(std1.swengcourses.course1);
        System.out.println(std1.swengcourses.course2);

       */

        System.out.println("\n---------------------------------------------------- ");


        try
        {
            //Creating a clone of learner1 and assigning it to learner2

            std2 = (SWEngStudent) std1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        //Printing Details of student1
        System.out.println("Details of Student 1: ");
        System.out.println("Id: "+std1.stdId);
        System.out.println("Name: "+std1.studentName);
        System.out.println("Course name: "+std1.swengcourses);

        //Printing all the courses of 'student1'
        System.out.println("Courses of stdudent 1: ");
        System.out.println(std1.swengcourses.course1);
        System.out.println(std1.swengcourses.course2);

        //Printing Details of student2
        System.out.println("Details of Student 2: ");
        System.out.println("Id: "+std2.stdId);
        System.out.println("Name: "+std2.studentName);
        System.out.println("Course name: "+std2.swengcourses);

        //Printing all the courses of 'student2'
        System.out.println("Courses of stdudent 2: ");
        System.out.println(std2.swengcourses.course1);
        System.out.println(std2.swengcourses.course2);


        //Changing the course3 of 'student 22'
        std2.studentName="Mehmet";
        std2.swengcourses.course2 = "Physics";

        //This change will be reflected in original stdudent1'
        System.out.println("Updated names and courses :");
        System.out.println("stdudent 1 name: "+std1.studentName);
        System.out.println("stdudent 2 name: "+std2.studentName);
        System.out.println(std1.swengcourses.course1);
        System.out.println(std1.swengcourses.course2);


    }




}
