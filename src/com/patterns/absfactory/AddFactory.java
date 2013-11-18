package com.patterns.absfactory;

public class AddFactory extends AbstractFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }

}
