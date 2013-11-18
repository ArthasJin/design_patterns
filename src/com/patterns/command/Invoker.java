package com.patterns.command;

public class Invoker {

    private Command mCommand = null;

    public void setCommand(Command command) {
        mCommand = command;
    }

    public void executeCommand() {
        mCommand.execute();
    }

}
