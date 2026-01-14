package HeadFirst_DesignPatterns.CH3;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Expresso(Beverage.Size.SMALL);
        System.out.println(beverage.getDescription() + " Cost: $" + beverage.cost());

        System.out.println();

        Beverage beverage1 = new DarkRoast(Beverage.Size.MEDIUM);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);

        System.out.println(beverage1.getDescription() + " Cost: $" + beverage1.cost());

        System.out.println();

        Beverage beverage2 = new DarkRoast(Beverage.Size.SMALL);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);

        System.out.println(beverage2.getDescription() + " Cost: $" + beverage2.cost());

    }
}

