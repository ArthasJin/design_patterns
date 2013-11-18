package com.patterns.factory;

public class OperationFactory {
    public static final int OPERATION_ADD = 0;
    public static final int OPERATION_SUB = 1;
    public static final int OPERATION_MUL = 2;
    public static final int OPERATION_DIV = 3;

    public static Operation createOperation(int operation) {
        Operation opt = null;
        switch (operation) {
        case OPERATION_ADD:
            opt = new OperationAdd();
            break;
        case OPERATION_SUB:
            opt = new OperationSub();
            break;
        case OPERATION_MUL:
            opt = new OperationMul();
            break;
        case OPERATION_DIV:
            opt = new OperationDiv();
            break;
        default:
            throw new IllegalArgumentException();
        }
        return opt;
    }
}
