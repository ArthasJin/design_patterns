package com.patterns.proxy;

public class Proxy extends Subject {

    private RealSubject mRealSubject = null;

    @Override
    public void request() {
        if (mRealSubject == null) {
            mRealSubject = new RealSubject();
        }
        mRealSubject.request();
    }

}
