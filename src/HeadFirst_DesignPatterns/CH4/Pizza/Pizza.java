package HeadFirst_DesignPatterns.CH4.Pizza;

public abstract class Pizza {
    public void prepare() {
        System.out.println("Preparing the most amazing pizza");
    }

    public void bake() {
        System.out.println("Baking the best pizza ever possible");
    }

    public void cut() {
        System.out.println("Cutting in even sets");
    }

    public void box() {
        System.out.println("Putting in the fresh box");
    }
}
