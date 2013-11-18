package com.patterns.flyweight;

public class UnsharedConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int state) {
        System.out.println("UnsharedConcreteFlyweight extrinsic state = "
                + state);
    }

}
