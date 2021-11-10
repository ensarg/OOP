package edu.sehir.oop;

/**
 * Created by ensar on 17.10.2016.
 */
public class ClassicSingleton {
    private static ClassicSingleton instance = null;
    public static int instance_counter=0;
    String e1;
    private ClassicSingleton() {
        e1 = new String("ensar Gul");
        instance_counter++;
    }

    void writeName(){
        System.out.println("my Name is "+e1 );
    }
    public static ClassicSingleton getInstance() {
        if(instance == null) {
            instance = new ClassicSingleton();
        }
        return instance;
    }
}
