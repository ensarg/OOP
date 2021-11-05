package edu.sehir.oop;

/**
 * Created by ensar on 14.11.2016.
 */
public class SocketObjectAdapterImpl implements SocketAdapter {

    //Using Composition for adapter pattern
    private Socket sock = new Socket();

    @Override
    public Volt get5Volt() {
        Volt v= sock.getVolt();
        return convertVolt(v,44);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }

}
