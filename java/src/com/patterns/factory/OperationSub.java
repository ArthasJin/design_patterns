package com.patterns.factory;

public class OperationSub extends Operation {

    @Override
    public double getResult() {
        return super.getNumA() - super.getNumB();
    }

}
