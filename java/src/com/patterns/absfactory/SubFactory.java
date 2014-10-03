package com.patterns.absfactory;

public class SubFactory extends AbstractFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }

}
