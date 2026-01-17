package HeadFirst_DesignPatterns.CH4.Ingredients.impl;

import HeadFirst_DesignPatterns.CH4.Ingredients.*;

// Here the impl of factory is making sure the best product based on regio is being shared.
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new FreshDough();
    }

    @Override
    public Cheese createCheeze() {
        return new FreshCheeze();
    }

    @Override
    public Sause createSauce() {
        return new FreshSause();
    }

    @Override
    public Calms createCalms() {
        return new FreshCalms();
    }

    @Override
    public Veggie[] createVeggie() {
        return new Veggie[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new FreshPepperoni();
    }
}
