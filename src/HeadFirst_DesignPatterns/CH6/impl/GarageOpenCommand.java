package HeadFirst_DesignPatterns.CH6.impl;

import HeadFirst_DesignPatterns.CH6.Appliances.Garage;
import HeadFirst_DesignPatterns.CH6.Command;

public class GarageOpenCommand implements Command {
    Garage garage;
    public GarageOpenCommand(Garage garage){
        this.garage = garage;
    }


    @Override
    public void execute() {
        garage.open();
    }

    @Override
    public void undo() {
        garage.close();
    }
}
