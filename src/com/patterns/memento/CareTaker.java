package com.patterns.memento;

public class CareTaker {

    private Memento mMemento = null;

    public Memento getMemento() {
        return mMemento;
    }

    public void setMemento(Memento memento) {
        this.mMemento = memento;
    }

}
