package tr.edu.sehir.oop;
import java.lang.reflect.InvocationTargetException;


public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
            NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{

        //tr.edu.sehir.oop.JavaClassLoader javaClassLoader = new tr.edu.sehir.oop.JavaClassLoader();
        JavaClassLoader jcl = new JavaClassLoader();
        jcl.invokeClassMethods("tr.edu.sehir.oop.MyClass");


    }
}
