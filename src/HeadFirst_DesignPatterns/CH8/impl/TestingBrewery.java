package HeadFirst_DesignPatterns.CH8.impl;

public class TestingBrewery {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        tea.prepareBrewery();
        coffee.prepareBrewery();

        CoffeWithHook coh = new CoffeWithHook();

        coh.prepareBrewery();
    }
}
