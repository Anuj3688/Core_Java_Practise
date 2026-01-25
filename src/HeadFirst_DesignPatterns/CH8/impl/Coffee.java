package HeadFirst_DesignPatterns.CH8.impl;

import HeadFirst_DesignPatterns.CH8.BreweryTemplate;

public class Coffee extends BreweryTemplate {
    @Override
    public void addOintments() {
        System.out.println("Adding Sugar and Milk!!!");
    }

    @Override
    public void brew() {
        System.out.println("Adding crusted Coffee!");
    }
}
