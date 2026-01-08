package HeadFirst_DesignPatterns.CH1;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck d = new MallardDuck();
        d.performFly();
        d.display();
        d.swim();
        d.performQuack();

        Duck d1 = new ModelDuck();
        d1.performFly();
        d1.setFlyBehaviour(new FlyLikeRocket());
        d1.performFly();

    }
}
