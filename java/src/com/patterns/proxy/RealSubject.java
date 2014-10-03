package com.patterns.proxy;

public class RealSubject extends Subject {

    @Override
    public void request() {
        System.out.println("Real request");
    }

}
