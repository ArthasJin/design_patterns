package com.patterns.observer;

public class ConcreteSubject extends Subject {

    private String mState = null;

    public ConcreteSubject(String state) {
        this.mState = state;
    }

    public void changeState(String state) {
        this.mState = state;
        notifyObservers();
    }
}
