package HeadFirst_DesignPatterns.CH6.Appliances;

public class Garage {
    private String loc;

    public Garage(String loc) {
        this.loc = loc;
    }

    public void open() {
        System.out.println("Opening the " + loc + " Garage Gate");
    }

    public void close() {
        System.out.println("Closing the " + loc + " Garage Gate");
    }
}
