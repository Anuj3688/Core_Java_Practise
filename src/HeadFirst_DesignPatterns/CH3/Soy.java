package HeadFirst_DesignPatterns.CH3;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", SOY";
    }

    @Override
    public double getSizeBasedPrize(Size size) {
        switch (size) {
            case Size.LARGE -> {
                return 0.12;
            }
            case Size.MEDIUM -> {
                return 0.17;
            }
            case Size.SMALL -> {
                return 0.22;
            }
        }
        return 0.00;
    }

    @Override
    public double cost() {
        return beverage.cost() + getSizeBasedPrize(beverage.getSize());
    }
}
