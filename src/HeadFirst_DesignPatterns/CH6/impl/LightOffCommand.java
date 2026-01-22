package HeadFirst_DesignPatterns.CH6.impl;

import HeadFirst_DesignPatterns.CH6.Appliances.Light;
import HeadFirst_DesignPatterns.CH6.Command;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
