package edu.sehir.adapter1;

public class AdapterPatternTest {

    public static void main(String[] args) {

        testClassAdapter();
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
        Volt v5 = getVolt(sockAdapter,5);

        System.out.println("v5 volts using Object Adapter="+v5.getVolts());

}

    private static void testClassAdapter() {
        SocketAdapter sockAdapter = new SocketClassAdapterImpl();
        Volt v5 = getVolt(sockAdapter,5);
        System.out.println("v5 volts using Class Adapter="+v5.getVolts());

    }

    private static Volt getVolt(SocketAdapter sockAdapter,int i) {
        switch (i){
            case 5: return sockAdapter.get5Volt();
            default: return sockAdapter.get5Volt();

        }
    }

    /**
     *
     One of the great real life example of Adapter design pattern is mobile charger.
     Mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 240V (Europe).
     So the mobile charger works as an adapter between mobile charging socket and the wall socket.
     We will try to implement multi-adapter using adapter design pattern in this tutorial.
     So first of all we will have two classes – Volt (to measure volts) and Socket (producing constant volts of 120V).
     */
}