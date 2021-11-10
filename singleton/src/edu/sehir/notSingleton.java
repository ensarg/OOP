package edu.sehir;

/**
 * Created by ensar on 17.10.2016.
 */
public class notSingleton {
    public static int instance_counter=0;
    // Private constructor prevents instantiation from other classes
    String e1;
    private notSingleton(){

        e1 = new String("ensar Gul");
        instance_counter++;
    }

    void writeName(){
        System.out.println("my Name is "+e1);
    }



    /**
     * SingletonHolder is loaded on the first execution of Singleton.getInstance()
     * or the first access to SingletonHolder.INSTANCE, not before.
     */

    public static  notSingleton getInstance() {
        return new notSingleton();
    }

}
