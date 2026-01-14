package HeadFirst_DesignPatterns.CH3;

public class Expresso extends Beverage{

    public Expresso(Size size){
        this.description = "Expresso Coffee";
        this.setSize(size);
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
