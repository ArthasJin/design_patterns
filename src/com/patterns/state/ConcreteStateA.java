package com.patterns.state;

public class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
        System.out.println("ConcreteStateA handle");
        context.setState(new ConcreteStateB());
    }

}
