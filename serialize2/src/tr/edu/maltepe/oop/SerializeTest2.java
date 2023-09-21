package tr.edu.maltepe.oop;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializeTest2 {

    public static void main(String[] args) {
        Employee e = new Employee(      "Ahmet"," Maltepe  univ",218123);
        Employee e2 = null;
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        } catch (IOException i ) {
            i.printStackTrace();
        }


        try {
            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e2 = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("\n Deserialized Employee...");
        System.out.println("Name: " + e2.getName());
        System.out.println("Address: " + e2.getAddress());
        System.out.println("SSN: " + e2.getStdno());
        //System.out.println("Number: " + e.number);



}


}
