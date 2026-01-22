package HeadFirst_DesignPatterns.CH6.impl;

import HeadFirst_DesignPatterns.CH6.Command;

//Created this to allocate to the empty spaces so that we don't get Null Pointers
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("NO COMMAND!");
    }

    @Override
    public void undo() {
        System.out.println("NO COMMAND!");
    }
}
