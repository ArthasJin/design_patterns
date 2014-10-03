package com.patterns.factory;

public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        return super.getNumA() / super.getNumB();
    }

}
