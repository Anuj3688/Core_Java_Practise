package HeadFirst_DesignPatterns.CH1.impl;

import HeadFirst_DesignPatterns.CH1.Turkey;

public class NewTurkey implements Turkey {
    @Override
    public void fly() {
        System.out.println("I fly Short!");
    }

    @Override
    public void gobble() {
        System.out.println("gobble Gobble");
    }
}
