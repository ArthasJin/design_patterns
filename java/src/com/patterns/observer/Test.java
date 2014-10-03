package com.patterns.observer;

public class Test {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject("ABC");
        subject.attach(new ConcreteObserver("observer1"));
        subject.attach(new ConcreteObserver("observer2"));
        subject.changeState("XYZ");
    }

}
