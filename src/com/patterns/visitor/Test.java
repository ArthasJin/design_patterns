package com.patterns.visitor;

public class Test {

    public static void main(String[] args) {
        DataStructure dataStructure = new DataStructure();
        dataStructure.attach(new ConcreteElementA());
        dataStructure.attach(new ConcreteElementB());

        ConcreteVisitorA visitorA = new ConcreteVisitorA();
        ConcreteVisitorB visitorB = new ConcreteVisitorB();

        dataStructure.accept(visitorA);
        dataStructure.accept(visitorB);
    }

}
