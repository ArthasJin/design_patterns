package com.patterns.bridge;

public class ConcreteImplementorA extends Implementor {

    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorA operation");
    }

}
