package HeadFirst_DesignPatterns.CH7;

import HeadFirst_DesignPatterns.CH1.Duck;
import HeadFirst_DesignPatterns.CH1.MallardDuck;
import HeadFirst_DesignPatterns.CH1.ModelDuck;

// Here we have a duck but need it to act like a turkey so using an adapter
public class AdapterTester {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        TurkeyDuckAdapter turkey = new TurkeyDuckAdapter(duck);

        turkey.fly();
        turkey.gobble();
    }
}
