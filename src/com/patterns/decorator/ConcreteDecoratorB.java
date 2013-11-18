package com.patterns.decorator;

public class ConcreteDecoratorB extends Decorator {

    public void operatoin() {
        super.operation();
        System.out.println(createElement());
    }

    public String createElement() {
        return new String("Concrete Decorator B");
    }
}
