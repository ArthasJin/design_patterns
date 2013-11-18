package com.patterns.visitor;

public abstract class Visitor {

    public abstract void visitElementA(ConcreteElementA elementA);
    
    public abstract void visitElementB(ConcreteElementB elementB);
    
}
