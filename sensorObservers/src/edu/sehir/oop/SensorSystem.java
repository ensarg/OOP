package edu.sehir.oop;

/**
 * Created by ensar on 07.12.2016.
 */
public class SensorSystem {
    private java.util.Vector listeners = new java.util.Vector();

    public void register( AlarmListener al ) {
        listeners.addElement( al );
    }
    public void soundTheAlarm() {
        for (java.util.Enumeration e=listeners.elements(); e.hasMoreElements(); )
            ((AlarmListener)e.nextElement()).alarm();
    }
}
