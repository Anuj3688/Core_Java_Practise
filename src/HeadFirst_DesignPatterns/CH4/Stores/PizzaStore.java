package HeadFirst_DesignPatterns.CH4.Stores;

import HeadFirst_DesignPatterns.CH4.Pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // Here createPizza will act as a Factory Method.
    // All the PizzaStore ConcreteClasses will implement this method.
    protected abstract Pizza createPizza();
}
