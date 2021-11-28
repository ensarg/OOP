package tr.edu.sehir.oop;

public class EncapsulationTest {

    public static void main(String[] args) {

        EncapsDemo1 obj = new EncapsDemo1();
        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        obj.setEmptckn(112233);
       // System.out.println("Employee Name: " + obj.empName); // you can not get private variabale


        EncapsDemo1 obj2 = new EncapsDemo1();
       // System.out.println("Employee Name: " + obj.empName);

        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getTckn());
        System.out.println("Employee Age: " + obj.getEmpAge());
    }
}
