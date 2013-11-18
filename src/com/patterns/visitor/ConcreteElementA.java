package com.patterns.visitor;

public class ConcreteElementA extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }

    public void operation() {

    }

}
