package HeadFirst_DesignPatterns.CH7;

import HeadFirst_DesignPatterns.CH1.Duck;
import HeadFirst_DesignPatterns.CH1.Turkey;

// Here we are just converting a duck into a turkey
public class TurkeyDuckAdapter implements Turkey {

    private final Duck duck;

    public TurkeyDuckAdapter(Duck duck){
        this.duck = duck;
    }

    // Calling 5 times since the turkey flys only short distance at a time.
    @Override
    public void fly() {
        for (int i =0 ; i<5 ; i++)
            duck.performFly();
    }

    @Override
    public void gobble() {
        duck.performQuack();
    }
}
