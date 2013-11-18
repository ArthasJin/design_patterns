package com.patterns.state;

public class ConcreteStateB extends State {

    @Override
    public void handle(Context context) {
        System.out.println("ConcreteStateB handle");
        context.setState(new ConcreteStateC());
    }

}
