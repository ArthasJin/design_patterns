package com.patterns.template;

public abstract class AbstractClass {
    public abstract void operatoin1();

    public abstract void operation2();

    public void template() {
        operatoin1();
        operation2();
        System.out.println("Template method");
    }
}
