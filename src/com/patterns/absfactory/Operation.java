package com.patterns.absfactory;

public abstract class Operation {
    private double mNumA = 0.0;
    private double mNumB = 0.0;

    public double getNumA() {
        return mNumA;
    }

    public void setNumA(double mNumA) {
        this.mNumA = mNumA;
    }

    public double getNumB() {
        return mNumB;
    }

    public void setNumB(double mNumB) {
        this.mNumB = mNumB;
    }

    public abstract double getResult();
}
