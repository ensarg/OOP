package tr.edu.sehir.ood;

import java.util.Vector;

public class CommandPatternTest {

    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();

        Light light = new Light();

        Command lightsOn = new LightsOnCommand(light);

        Command lightsOff = new LightsOffCommand(light);

        Vector commandarray = new Vector<>();
         commandarray.add(lightsOn);
         commandarray.add(lightsOff);

        //switch on

        control.setCommand(lightsOn);

        control.pressButton();

        //switch off

        control.setCommand(lightsOff);

        control.pressButton();

    }
}
