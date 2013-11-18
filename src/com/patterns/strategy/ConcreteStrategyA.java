package com.patterns.strategy;

public class ConcreteStrategyA extends Strategy {

    @Override
    public void findElement() {
        System.out.println("ConcreteStrategyA applied");
    }

}
