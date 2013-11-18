package com.patterns.absfactory;

public class MulFactory extends AbstractFactory {

    @Override
    public Operation createOperation() {
        return new OperationMul();
    }

}
