package com.patterns.absfactory;

public class DivFactory extends AbstractFactory {

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }

}
