package HeadFirst_DesignPatterns.CH6;

import HeadFirst_DesignPatterns.CH6.Appliances.Garage;
import HeadFirst_DesignPatterns.CH6.Appliances.Light;
import HeadFirst_DesignPatterns.CH6.impl.GarageCloseCommand;
import HeadFirst_DesignPatterns.CH6.impl.GarageOpenCommand;
import HeadFirst_DesignPatterns.CH6.impl.LightOffCommand;
import HeadFirst_DesignPatterns.CH6.impl.LightOnCommand;

public class RemoteControllerTester {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        Light bedLight = new Light("Bed");
        LightOnCommand lightOnCommand = new LightOnCommand(bedLight);
        LightOffCommand lightOffCommand = new LightOffCommand(bedLight);

        Garage garage = new Garage("Ground Floor");
        GarageOpenCommand garageOpenCommand = new GarageOpenCommand(garage);
        GarageCloseCommand garageCloseCommand = new GarageCloseCommand(garage);

        remoteController.setOffCommand(1,lightOffCommand);
        remoteController.setOnCommand(1,lightOnCommand);

        remoteController.setOnCommand(2,garageOpenCommand);
        remoteController.setOffCommand(2,garageCloseCommand);

        remoteController.onButtonPressed(1);
        remoteController.onButtonPressed(1);
        remoteController.offButtonPressed(1);
        remoteController.undo();

        remoteController.onButtonPressed(2);
        remoteController.undo();
        remoteController.offButtonPressed(2);

        System.out.println(remoteController);
    }
}
