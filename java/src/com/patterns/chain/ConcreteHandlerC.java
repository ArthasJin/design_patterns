package com.patterns.chain;

public class ConcreteHandlerC extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request == 3) {
            System.out.println("ConcreteHandlerC handleRequest " + request);
        } else if (mSuccessor != null) {
            mSuccessor.handleRequest(request);
        }
    }

}
