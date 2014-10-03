package com.patterns.absfactory;

public class OperationMul extends Operation {

    @Override
    public double getResult() {
        return super.getNumA() * super.getNumB();
    }

}
