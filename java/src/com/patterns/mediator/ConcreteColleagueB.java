package com.patterns.mediator;

public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void update(String message) {
        System.out.println("ColleagueB update " + message);
    }

    @Override
    public void send(String message) {
        mMediator.send(message, this);
    }

}
