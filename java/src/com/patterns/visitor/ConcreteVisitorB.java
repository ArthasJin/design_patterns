package com.patterns.visitor;

public class ConcreteVisitorB extends Visitor {

    @Override
    public void visitElementA(ConcreteElementA elementA) {
        System.out.println("ConcreteVisitorB visits " + elementA.getClass().getSimpleName());
    }

    @Override
    public void visitElementB(ConcreteElementB elementB) {
        System.out.println("ConcreteVisitorB visits " + elementB.getClass().getSimpleName());
    }

}
