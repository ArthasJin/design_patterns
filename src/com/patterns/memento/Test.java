package com.patterns.memento;

public class Test {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("On");
        originator.display();

        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(originator.createMemento());

        originator.setState("Off");
        originator.display();

        originator.setMemento(careTaker.getMemento());
        originator.display();
    }

}
