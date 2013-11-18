package com.patterns.adapter;

public class Test {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }

}
