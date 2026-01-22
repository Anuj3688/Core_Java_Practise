package HeadFirst_DesignPatterns.CH6;

import HeadFirst_DesignPatterns.CH6.impl.NoCommand;

public class RemoteController {
    private Command[] onCommands;
    private Command[] offCommands;

    private Command lastCommand;

    public RemoteController() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void onButtonPressed(int slot){
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
    }

    public void offButtonPressed(int slot){
        offCommands[slot].execute();
        lastCommand = offCommands[slot];
    }

    public void setOnCommand(int slot, Command command) {
        this.onCommands[slot] = command;
    }

    public void setOffCommand(int slot, Command command) {
        this.offCommands[slot] = command;
    }

    public void undo(){
        System.out.println("\nUNDO INITIATED:");
        lastCommand.undo();
        System.out.println();
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-----Remote Controller-----\n");
        for (int i =0; i<onCommands.length ; i++){
            stringBuffer.append("[SLOT "+i+"] On:"+onCommands[i].getClass().getName()+" Off: "+offCommands[i].getClass().getName()+"\n");
        }
        return stringBuffer.toString();
    }
}
