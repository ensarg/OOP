package tr.edu.maltepe.oop;

public class Student extends Person{
    private String studentId;
    private String department;

    public Student(String name, String surname, int age, String studentId, String department) {
        super(name, surname, age);
        this.studentId = studentId;
        this.department = department;
    }
    public Student (String name, String surname, int age, String studentId) {
        super(name, surname, age);
        this.studentId = studentId;
        this.department = "Software Engineering";
    }

    void inLecture() {
        System.out.println("Student " + this.getName() + " fell asleep.");
    }

    public String getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void print() {
        super.print();
        System.out.println("Student ID: " + studentId + " Department: " + department);
    }
}
