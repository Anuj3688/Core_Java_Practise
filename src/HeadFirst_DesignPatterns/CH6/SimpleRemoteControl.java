package HeadFirst_DesignPatterns.CH6;

public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl(){}

    public Command getSlot() {
        return slot;
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonpress(){
        slot.execute();
    }
}
