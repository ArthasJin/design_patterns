package com.patterns.flyweight;

public class SharedConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int state) {
        System.out
                .println("SharedConcreteFlyweight extrinsic state = " + state);
    }

}
