package HeadFirst_DesignPatterns.CH6;

import HeadFirst_DesignPatterns.CH6.Appliances.Light;
import HeadFirst_DesignPatterns.CH6.impl.LightOnCommand;

public class SimpleRemoteControlTester {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light kitchenLight = new Light("Kitchen Light");
        LightOnCommand lightOnCommand = new LightOnCommand(kitchenLight);
        simpleRemoteControl.setSlot(lightOnCommand);

        simpleRemoteControl.buttonpress();
    }
}
