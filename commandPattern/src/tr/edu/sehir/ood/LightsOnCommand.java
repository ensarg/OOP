package tr.edu.sehir.ood;

public class LightsOnCommand implements Command{
    //reference to the light

    Light light;

    public LightsOnCommand(Light light){

        this.light = light;

    }

    public void execute(){

        light.switchOn();
        System.out.println(" light switched on\n");

    }
}
