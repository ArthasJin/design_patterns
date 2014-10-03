package com.patterns.factory;

public class Test {

    public static void main(String[] args) {
        Operation opter = OperationFactory
                .createOperation(OperationFactory.OPERATION_ADD);
        opter.setNumA(1.1);
        opter.setNumB(2.2);
        System.out.println(opter.getResult());

        opter = OperationFactory
                .createOperation(OperationFactory.OPERATION_MUL);
        opter.setNumA(1.1);
        opter.setNumB(2.2);
        System.out.println(opter.getResult());
    }
}
