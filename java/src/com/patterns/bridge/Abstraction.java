package com.patterns.bridge;

public abstract class Abstraction {

    protected Implementor mImplementor = null;

    public void setImplementor(Implementor implementor) {
        mImplementor = implementor;
    }

    public void operation() {
        mImplementor.operationImpl();
    }

}
