package com.patterns.strategy;

public class Test {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.apply();
    }

}
