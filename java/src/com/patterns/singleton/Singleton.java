package com.patterns.singleton;

public final class Singleton {

    private static Singleton mSingleton = null;

    public static synchronized Singleton createInstance() {
        if (mSingleton == null) {
            mSingleton = new Singleton();
        }
        return mSingleton;
    }

    public void display() {
        System.out.println("Singleton instance");
    }
}
