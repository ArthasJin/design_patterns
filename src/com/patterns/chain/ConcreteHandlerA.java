package com.patterns.chain;

public class ConcreteHandlerA extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request == 1) {
            System.out.println("ConcreteHandlerA handleRequest " + request);
        } else if (mSuccessor != null) {
            mSuccessor.handleRequest(request);
        }
    }

}
