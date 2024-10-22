package tr.edu.maltepe.oop;
import tr.edu.maltepe.oop.Test2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ClassLoader_01 {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
            NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

        Object ob=null;
        CustomClassLoaderDemo loader = new CustomClassLoaderDemo();
        Class<?> c = loader.findClass("tr.edu.maltepe.oop.Test");

         ob = c.getDeclaredConstructor().newInstance();

        Method md[] = c.getDeclaredMethods();
        String mname = md[1].getName();
        System.out.println("method -->" +mname);
        md[1].invoke(ob);
       /*
        for (Method m : md ){
            String mname = m.getName();
            System.out.println("method -->" +mname);
            m.invoke(ob);

        }
        */
       // Test2 tt = new Test2();
       // tt.addnumbers();

    }
    }

