package com.patterns.flyweight;

public class Test {

    public static void main(String[] args) {
        int extrinsicState = 30;
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight flyweightX = flyweightFactory.getFlyweight("X");
        flyweightX.operation(extrinsicState--);

        Flyweight flyweightY = flyweightFactory.getFlyweight("Y");
        flyweightY.operation(extrinsicState--);

        Flyweight flyweightZ = flyweightFactory.getFlyweight("Z");
        flyweightZ.operation(extrinsicState--);

        UnsharedConcreteFlyweight unsharedFlyweight = new UnsharedConcreteFlyweight();
        unsharedFlyweight.operation(extrinsicState--);
    }

}
