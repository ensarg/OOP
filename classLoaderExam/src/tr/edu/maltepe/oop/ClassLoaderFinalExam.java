package tr.edu.maltepe.oop;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassLoaderFinalExam extends ClassLoader{

    public void testClassLoader(String classBinName){

        try {

            Object myClassObject = null;
            ClassLoader classLoader = this.getClass().getClassLoader();

            Class<?> loadedMyClass = classLoader.loadClass(classBinName);

            System.out.println("Loaded class name: " + loadedMyClass.getName());

            Constructor<?> constructor = loadedMyClass.getConstructor();
            //System.out.println("Constructor: " + constructor);

            myClassObject = constructor.newInstance();

            Method mm[] = loadedMyClass.getDeclaredMethods();

            System.out.println(mm[0].invoke(myClassObject));
            //System.out.println(mm[1].invoke(myClassObject));
            //System.out.println(mm[1].invoke(myClassObject, 3,5));


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


