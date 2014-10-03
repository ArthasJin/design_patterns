package com.patterns.factory;

public class Operation {
    private double mNumA = 0.0;
    private double mNumB = 0.0;

    public double getResult() {
        return 0.0;
    }

    public double getNumA() {
        return mNumA;
    }

    public void setNumA(double numA) {
        this.mNumA = numA;
    }

    public double getNumB() {
        return mNumB;
    }

    public void setNumB(double numB) {
        this.mNumB = numB;
    }
}
