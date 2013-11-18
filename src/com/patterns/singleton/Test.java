package com.patterns.singleton;

public class Test {

    public static void main(String[] args) {
        Singleton singleton = Singleton.createInstance();
        singleton.display();
    }

}
