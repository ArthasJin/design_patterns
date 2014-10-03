package com.patterns.chain;

public class Test {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandlerA();
        Handler handler2 = new ConcreteHandlerB();
        Handler handler3 = new ConcreteHandlerC();
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        int[] requests = { 4, 2, 3, 1 };
        for (int i = 0; i < requests.length; i++) {
            handler1.handleRequest(requests[i]);
        }
    }

}
