package com.patterns.mediator;

public abstract class Colleague {

    protected Mediator mMediator = null;

    public Colleague(Mediator mediator) {
        mMediator = mediator;
    }

    public abstract void send(String message);
    
}
