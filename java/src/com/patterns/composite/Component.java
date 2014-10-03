package com.patterns.composite;

public abstract class Component {

    private String mName = null;

    public Component(String name) {
        this.mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int depth);
}
