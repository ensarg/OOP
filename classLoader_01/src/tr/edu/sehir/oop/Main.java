package tr.edu.sehir.oop;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
            NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

        CustomClassLoaderDemo loader = new CustomClassLoaderDemo();
        Class<?> c = loader.findClass("tr.edu.sehir.oop.Test");
        Object ob = c.getDeclaredConstructor().newInstance();
        Method md = c.getMethod("show");
        md.invoke(ob);
    }
}
