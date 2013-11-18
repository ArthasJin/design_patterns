package com.patterns.composite;

public class Test {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("leafA"));
        root.add(new Leaf("leafB"));

        Composite composite1 = new Composite("composite1");
        composite1.add(new Leaf("composite1 leafA"));
        composite1.add(new Leaf("composite1 leafB"));

        root.add(composite1);
        root.display(1);
    }

}
