package com.patterns.absfactory;

public class Test {

    public static void main(String[] args) {
        AbstractFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setNumA(1.1);
        operation.setNumB(2.5);
        System.out.println(operation.getResult());
    }

}
