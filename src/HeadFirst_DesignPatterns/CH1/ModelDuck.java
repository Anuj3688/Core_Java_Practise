package HeadFirst_DesignPatterns.CH1;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
