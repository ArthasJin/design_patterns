package com.patterns.chain;

public class ConcreteHandlerB extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request == 2) {
            System.out.println("ConcreteHandlerB handleRequest " + request);
        } else if (mSuccessor != null) {
            mSuccessor.handleRequest(request);
        }
    }

}
