package com.patterns.adapter;

public class Adapter extends Target {

    private final static int REQUEST_TYPE = 1;
    private Adaptee mAdaptee = new Adaptee();

    @Override
    public void request() {
        mAdaptee.requestByType(REQUEST_TYPE);
    }

}
