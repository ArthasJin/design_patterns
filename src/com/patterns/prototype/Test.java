package com.patterns.prototype;

public class Test {

    public static void main(String[] args) {
        ConcretePrototype prototype1 = new ConcretePrototype("1");
        ConcretePrototype prototype2 = (ConcretePrototype) prototype1.copy();
        System.out.println("id = " + prototype2.getId());
    }

}
