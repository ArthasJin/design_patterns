package com.patterns.visitor;

public class ConcreteElementB extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementB(this);
    }

    public void operation() {

    }

}
