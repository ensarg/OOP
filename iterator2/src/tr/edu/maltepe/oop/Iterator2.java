package tr.edu.maltepe.oop;
import java.util.*;
import java.util.ArrayList;

public class Iterator2 {

    public static void main(String[] args) {
        // Java code to illustrate iterator()
                // Create and populate the list

                ArrayList<aClass> list
                        = new ArrayList<>();
                aClass a1 =new aClass("ensar");
                aClass a2 =new aClass("gul");
                aClass a3 =new aClass("hoca");

                list.add(a1);
                list.add(a2);
                list.add(a3);


                // Displaying the list
              //  System.out.println("The list is: \n"
               //         + list);

               a3.setStr("bey");

                // Create an iterator for the list
                // using iterator() method
                Iterator<aClass> iter
                        = list.iterator();

                // Displaying the values after iterating
                // through the list
                System.out.println("\nThe iterator values"
                        + " of list are: ");
                while (iter.hasNext()) {
                    System.out.print(iter.next().getStr() + " ");

                }
                    System.out.println("\nThe iterator values of list are(2): ");
                    while (iter.hasNext()) {
                        System.out.print(iter.next().getStr() + " ");


                    }
            }




}
