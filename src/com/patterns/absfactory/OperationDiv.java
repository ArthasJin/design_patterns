package com.patterns.absfactory;

public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        return super.getNumA() / super.getNumB();
    }

}
