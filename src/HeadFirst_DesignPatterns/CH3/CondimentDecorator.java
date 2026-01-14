package HeadFirst_DesignPatterns.CH3;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;
    public abstract String getDescription();
    public abstract double getSizeBasedPrize(Size size);
}
