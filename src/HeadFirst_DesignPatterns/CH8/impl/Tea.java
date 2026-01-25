package HeadFirst_DesignPatterns.CH8.impl;

import HeadFirst_DesignPatterns.CH8.BreweryTemplate;

public class Tea extends BreweryTemplate {
    @Override
    public void addOintments() {
        System.out.println("Adding Lemon!");
    }

    @Override
    public void brew() {
        System.out.println("Mixing and amazing tea");
    }
}
