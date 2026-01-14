package HeadFirst_DesignPatterns.CH3;

public class DarkRoast extends Beverage{
    public DarkRoast(Size size){
        this.description = "Dark Roast";
        this.setSize(size);
    }
    @Override
    public double cost() {
        return 2.99;
    }
}
