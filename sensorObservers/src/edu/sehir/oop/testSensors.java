package edu.sehir.oop;

public class testSensors{

    public static void main(String[] args) {
        SensorSystem ss = new SensorSystem();
        ss.register( new Gates()        );
        ss.register( new Lighting()     );
        ss.register( new Surveillance() );
        ss.soundTheAlarm();
    }
}
