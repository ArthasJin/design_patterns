package com.patterns.builder;

public class Director {

    public void constrcut(Builder builder) {
        if (builder != null) {
            builder.buildPartA();
            builder.buildPartB();
        }
    }
}
