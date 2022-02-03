package tr.edu.sehir.oop;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassLoader_01 {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
            NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

        CustomClassLoaderDemo loader = new CustomClassLoaderDemo();
        Class<?> c = loader.findClass("tr.edu.sehir.oop.Test2");
        Object ob = c.getDeclaredConstructor().newInstance();
        Method md[] = c.getDeclaredMethods();
        for (Method m : md ){
            String mname = m.getName();
            System.out.println("method -->" +mname);
            m.invoke(ob);

        }

    }
}
