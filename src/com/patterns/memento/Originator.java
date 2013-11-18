package com.patterns.memento;

public class Originator {

    private String mState = null;

    public Memento createMemento() {
        return new Memento(mState);
    }

    public void setMemento(Memento memento) {
        mState = memento.getState();
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        this.mState = state;
    }

    public void display() {
        System.out.println("State = " + mState);
    }
}
