package com.patterns.mediator;

public class ConcreteMediator extends Mediator {

    private ConcreteColleagueA mColleagueA = null;

    private ConcreteColleagueB mColleagueB = null;

    public void setColleagueA(ConcreteColleagueA colleague) {
        mColleagueA = colleague;
    }

    public void setColleagueB(ConcreteColleagueB colleague) {
        mColleagueB = colleague;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == mColleagueA) {
            mColleagueB.update(message);
        } else if (colleague == mColleagueB) {
            mColleagueA.update(message);
        }
    }

}
