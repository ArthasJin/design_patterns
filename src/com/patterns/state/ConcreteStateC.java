package com.patterns.state;

public class ConcreteStateC extends State {

    @Override
    public void handle(Context context) {
        System.out.println("ConcreteStateC handle");
        context.setState(new ConcreteStateA());
    }

}
