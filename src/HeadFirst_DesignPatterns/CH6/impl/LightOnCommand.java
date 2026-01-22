package HeadFirst_DesignPatterns.CH6.impl;

import HeadFirst_DesignPatterns.CH6.Appliances.Light;
import HeadFirst_DesignPatterns.CH6.Command;

public class LightOnCommand  implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
