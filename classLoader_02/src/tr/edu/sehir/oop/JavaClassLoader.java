package tr.edu.sehir.oop;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author
 *
 */
public class JavaClassLoader extends ClassLoader {

    public void invokeClassMethods(String classBinName){

        try {

            // Create a new JavaClassLoader
            ClassLoader classLoader = this.getClass().getClassLoader();

            // Load the target class using its binary name
            Class<?> loadedMyClass = classLoader.loadClass(classBinName);

            System.out.println("Loaded class name: " + loadedMyClass.getName());

            // get the constructor of loaded class
            Constructor<?> constructor = loadedMyClass.getConstructor();
           //Constructor<?> constructor = loadedMyClass.getConstructor(new Class[] {int.class, int.class});
           //int.class resolves to java.lang.Integer.TYPE

            System.out.println("Constructor: " + constructor);

            // Create a new instance from the loaded class
            Object myClassObject = constructor.newInstance();
            //Object myClassObject = constructor.newInstance(5,6);

            // Getting the target method from the loaded class and invoke it using its name
            Method mm[] = loadedMyClass.getDeclaredMethods();
            //Method method = loadedMyClass.getMethod(methodName);
            //System.out.println("Invoked method name: " + method.getName());
            //System.out.println("Invoked method name: " + mm[0].getName());
            //method.invoke(myClassObject);

            for (int i=0;i < mm.length;i++ )
                mm[i].invoke(myClassObject);




        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}