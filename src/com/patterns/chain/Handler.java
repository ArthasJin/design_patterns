package com.patterns.chain;

public abstract class Handler {

    protected Handler mSuccessor = null;

    public void setSuccessor(Handler successor) {
        mSuccessor = successor;
    }

    public abstract void handleRequest(int request);

}
