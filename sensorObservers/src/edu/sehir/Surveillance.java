package edu.sehir;

/**
 * Created by ensar on 07.12.2016.
 */
public class Surveillance extends CheckList implements AlarmListener {
    public void alarm() {
        System.out.println( "Surveillance - by the numbers:" );
        byTheNumbers(); }
     protected void isolate() { System.out.println( "   train the cameras" ); }
}
