package com.patterns.builder;

public class Test {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder1 = new ConcreteBuilder1();
        director.constrcut(builder1);
        builder1.getResult().show();

        System.out.println("-----------------------");
        Builder builder2 = new ConcreteBuilder2();
        director.constrcut(builder2);
        builder2.getResult().show();
    }
}
