package com.patterns.decorator;

public class Test {

    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();
        d1.setComponent(component);
        d2.setComponent(d1);
        d2.operatoin();
    }

}
