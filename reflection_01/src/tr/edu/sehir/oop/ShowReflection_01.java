package tr.edu.sehir.oop;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import static java.lang.System.out;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class ShowReflection_01 {

    public void printClassName(Object obj) {

        System.out.println("The class of " + obj +
                " is " + obj.getClass().getName());


    }
     //tr.edu.sehir.oop.reflectionTest
    public void DumpMethods(String aclass) {

        try {
            Class c = Class.forName(aclass);
            System.out.println("Name of the class is: "+ c.getName());
            System.out.println("Super Class is: "+c.getSuperclass() );

            System.out.println("Methods are: ");
            Method all_m[] = c.getDeclaredMethods();

            for (int i = 0; i < all_m.length; i++) {
                System.out.println("m["+i+"] -->" +all_m[i].toString());
            }


            System.out.println("Canonical name is: "+ c.getCanonicalName() );
            //System.out.println("package name name is: "+ c.getPackageName() );

            /*
            System.out.println("we can also invoke methods ");
            //reflectionTest ob1 = new reflectionTest();
            Object ob = c.getDeclaredConstructor().newInstance();
            //printClassName(ob);

            for (Method m : all_m) {
                String mname = m.getName();
                System.out.println("method -->" +mname);
                m.invoke(ob);
                // ob1.addIntegers()
                //ob1.multiplyIntegers()

            }

          */
/*
            for (int i = 0; i < all_m.length; i++) {
                //Method amethod= c.getMethod(all_m[i].getName());
                Method amethod= all_m[i];

                System.out.println("m["+i+"] -->" +all_m[i].toString());
                amethod.invoke(ob);

            }
*/

           /*
            System.out.println("Modifiers:"+
                    Modifier.toString(c.getModifiers()));


            out.format("Type Parameters:%n");
            TypeVariable[] tv = c.getTypeParameters();
            if (tv.length != 0) {
                out.format("  ");
                for (TypeVariable t : tv)
                    out.format("%s ", t.getName());
                out.format("%n%n");
            } else {
                out.format("  -- No Type Parameters --%n%n");
            }

*/

        } catch (Throwable e) {
            System.err.println(e);
        }

    }


}

