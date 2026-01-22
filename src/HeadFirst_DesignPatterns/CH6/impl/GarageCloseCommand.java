package HeadFirst_DesignPatterns.CH6.impl;

import HeadFirst_DesignPatterns.CH6.Appliances.Garage;
import HeadFirst_DesignPatterns.CH6.Command;

public class GarageCloseCommand implements Command {
    Garage garage;

    public GarageCloseCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.close();
    }

    @Override
    public void undo() {
        garage.open();
    }
}
