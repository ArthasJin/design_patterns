package com.patterns.facade;

public class Facade {

    private SubSystem1 mSubSystem1 = null;
    private SubSystem2 mSubSystem2 = null;
    private SubSystem3 mSubSystem3 = null;
    private SubSystem4 mSubSystem4 = null;

    public Facade() {
        mSubSystem1 = new SubSystem1();
        mSubSystem2 = new SubSystem2();
        mSubSystem3 = new SubSystem3();
        mSubSystem4 = new SubSystem4();
    }

    public void methodA() {
        mSubSystem1.method1();
        mSubSystem2.method2();
    }

    public void methodB() {
        mSubSystem3.method3();
        mSubSystem4.method4();
    }
}
