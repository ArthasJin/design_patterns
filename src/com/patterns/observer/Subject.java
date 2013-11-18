package com.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> mObservers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        mObservers.add(observer);
    }

    public void detach(Observer observer) {
        mObservers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : mObservers) {
            observer.update();
        }
    }
}
