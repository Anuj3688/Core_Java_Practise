package HeadFirst_DesignPatterns.CH3;

public abstract class Beverage {
    public enum Size {SMALL, MEDIUM, LARGE}

    Size size = Size.LARGE;
    String description = "Unknown";

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
