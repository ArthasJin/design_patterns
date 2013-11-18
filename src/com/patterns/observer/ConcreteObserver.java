package com.patterns.observer;

public class ConcreteObserver extends Observer {

    private String mName = null;

    public ConcreteObserver(String name) {
        this.mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    @Override
    public void update() {
        System.out.println("ConcreteObserver " + mName + " update");
    }

}
