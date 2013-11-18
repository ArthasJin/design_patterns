package com.patterns.factory;

public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return super.getNumA() + super.getNumB();
    }
}
