package edu.sehir.adapter1;

/**
 * Created by ensar on 14.11.2016.
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter{

    @Override
    public Volt get5Volt() {
        Volt v= getVolt();
        return convertVolt(v,44);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
