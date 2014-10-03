package com.patterns.factory;

public class OperationMul extends Operation {

    @Override
    public double getResult() {
        return super.getNumA() * super.getNumB();
    }

}
