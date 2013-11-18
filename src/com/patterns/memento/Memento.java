package com.patterns.memento;

public class Memento {

    private String mState = null;

    public Memento(String state) {
        this.mState = state;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        this.mState = state;
    }

}
