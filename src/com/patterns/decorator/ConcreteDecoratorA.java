package com.patterns.decorator;

public class ConcreteDecoratorA extends Decorator {

    public void operatoin() {
        super.operation();
        System.out.println(createOperation());
    }

    public String createOperation() {
        return new String("Concrete Decorator A");
    }
}
