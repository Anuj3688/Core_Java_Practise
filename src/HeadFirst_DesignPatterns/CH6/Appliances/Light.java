package HeadFirst_DesignPatterns.CH6.Appliances;

public class Light {
    private final String loc;
    private Boolean isOn = Boolean.FALSE;

    public Light(String loc) {
        this.loc = loc;
    }

    public void on() {
        if (!isOn){
            System.out.println("Light is On! " + this.loc);
            isOn = true;
        }
        else System.out.println("Lights are already On for " + this.loc);
    }

    public void off() {
        if (isOn) {
            System.out.println("Light is Off! " + this.loc);
            isOn = false;
        }
        else System.out.println("Lights are already Off for " + this.loc);
    }
}
