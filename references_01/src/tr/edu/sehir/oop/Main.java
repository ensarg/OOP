package tr.edu.sehir.oop;

import java.lang.ref.WeakReference;
import java.lang.ref.SoftReference;
import java.lang.ref.*;
// https://www.geeksforgeeks.org/types-references-java/

public class Main {

    public static void main(String[] args) {


        //Strong Reference - by default
        refExample rf = new refExample();
        rf.x();

        //Now, object to which 'rf' was pointing earlier is
        //eligible for garbage collection.
        //rf = null;

        //--- weak reference
        /*
        // Creating Weak Reference to refExample-type object to which 'rf'
        // is also pointing.
        WeakReference<refExample> weakref = new WeakReference<refExample>(rf);

        //Now, refExample-type object to which 'rf' was pointing earlier
        //is available for garbage collection.
        //But, it will be garbage collected only when JVM needs memory.
        rf = null;

        // You can retrieve back the object which
        // has been weakly referenced.
        // It successfully calls the method.
        rf = weakref.get();

        rf.x();
        */
        /*
        //--------soft reference  ---

        // Creating Soft Reference to refExample-type object to which 'rf'
        // is also pointing.
        SoftReference<refExample> softref = new SoftReference<refExample>(rf);

        // Now, refExample-type object to which 'rf' was pointing
        // earlier is available for garbage collection.
        rf = null;

        // You can retrieve back the object which
        // has been weakly referenced.
        // It successfully calls the method.
        rf = softref.get();

        rf.x();
        */

    //--------------phantom refrences
        //Creating reference queue
        ReferenceQueue<refExample> refQueue = new ReferenceQueue<refExample>();

        //Creating Phantom Reference to refExample-type object to which 'rf'
        //is also pointing.
        PhantomReference<refExample> phantomRef = null;

        phantomRef = new PhantomReference<refExample>(rf,refQueue);

        //Now, refExample-type object to which 'rf' was pointing
        //earlier is available for garbage collection.
        //But, this object is kept in 'refQueue' before
        //removing it from the memory.
        rf = null;

        //It always returns null.
        rf = phantomRef.get();

        //It shows NullPointerException.
        rf.x();



    }
}
