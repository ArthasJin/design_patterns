package com.patterns.state;

public class Context {

    private State mState = null;

    public Context(State state) {
        this.mState = state;
    }

    public State getState() {
        return mState;
    }

    public void setState(State mState) {
        this.mState = mState;
    }

    public void request() {
        if (mState != null) {
            mState.handle(this);
        }
    }
}
