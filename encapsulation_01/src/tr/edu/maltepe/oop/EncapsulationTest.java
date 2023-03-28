package tr.edu.maltepe.oop;

public class EncapsulationTest {

    public static void main(String[] args) {

        Employee ee = new Employee();
        ee.setEmpName("ahmet");
        ee.setEmpAge(32);
        ee.setEmptckn(112233);
        ee.setEmpName("mehmet");
        System.out.println("Employee Name: " + ee.getEmpName());


        Employee obj2 = new Employee();
        System.out.println("Employee Name: " + obj2.getEmpName());

        System.out.println("Employee Name: " + obj2.getEmpName());
        System.out.println("Employee SSN: " + obj2.getTckn());
        System.out.println("Employee Age: " + obj2.getEmpAge());


    }
}
