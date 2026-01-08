package HeadFirst_DesignPatterns.CH1;

public class MuteQuack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("---");
    }
}
