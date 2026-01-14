package HeadFirst_DesignPatterns.CH3;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", MOCHA";
    }

    @Override
    public double cost() {
        return beverage.cost() + getSizeBasedPrize(beverage.getSize());
    }

    public double getSizeBasedPrize(Size size) {
        switch (size) {
            case Size.LARGE -> {
                return 0.10;
            }
            case Size.MEDIUM -> {
                return 0.15;
            }
            case Size.SMALL -> {
                return 0.20;
            }
        }
        return 0.00;
    }
}
