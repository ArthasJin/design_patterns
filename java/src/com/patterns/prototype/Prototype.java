package com.patterns.prototype;

public abstract class Prototype implements Cloneable {

    private String mId = null;

    public Prototype(String id) {
        this.mId = id;
    }

    public String getId() {
        return mId;
    }

    public void setId(String mId) {
        this.mId = mId;
    }

    public abstract Prototype copy();
}
