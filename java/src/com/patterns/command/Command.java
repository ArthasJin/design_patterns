package com.patterns.command;

public abstract class Command {

    protected Receiver mReceiver = null;

    public Command(Receiver receiver) {
        mReceiver = receiver;
    }

    public abstract void execute();

}
