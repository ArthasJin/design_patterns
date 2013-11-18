package com.patterns.visitor;

public class ConcreteVisitorA extends Visitor {

    @Override
    public void visitElementA(ConcreteElementA elementA) {
        System.out.println("ConcreteVisitorA visits " + elementA.getClass().getSimpleName());
    }

    @Override
    public void visitElementB(ConcreteElementB elementB) {
        System.out.println("ConcreteVisitorA visits " + elementB.getClass().getSimpleName());
    }

}
