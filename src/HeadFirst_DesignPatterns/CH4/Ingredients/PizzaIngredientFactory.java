package HeadFirst_DesignPatterns.CH4.Ingredients;

// Here this is an Abstract Factory which will handle certain Families of Object
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Cheese createCheeze();
    public Sause createSauce();
    public Calms createCalms();
    public Veggie[] createVeggie();
    public Pepperoni createPepperoni();
}
