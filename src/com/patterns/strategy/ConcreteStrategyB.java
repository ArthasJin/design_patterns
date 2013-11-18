package com.patterns.strategy;

public class ConcreteStrategyB extends Strategy {

    @Override
    public void findElement() {
        System.out.println("ConcreteStrategyA applied");
    }

}
