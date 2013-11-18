package com.patterns.bridge;

public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        mImplementor.operationImpl();
    }

}
