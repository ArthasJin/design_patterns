package com.patterns.strategy;

public class Context {
    private Strategy mStrategy = null;

    public Context(Strategy strategy) {
        this.mStrategy = strategy;
    }

    public void apply() {
        if (mStrategy != null) {
            mStrategy.findElement();
        }
    }
}
