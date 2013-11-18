package com.patterns.mediator;

public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void update(String message) {
        System.out.println("ColleagueA update " + message);
    }

    @Override
    public void send(String message) {
        mMediator.send(message, this);
    }

}
