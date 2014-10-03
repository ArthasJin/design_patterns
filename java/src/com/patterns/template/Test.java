package com.patterns.template;

public class Test {

    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClassA();
        abstractClass.template();
        abstractClass = new ConcreteClassB();
        abstractClass.template();
    }

}
