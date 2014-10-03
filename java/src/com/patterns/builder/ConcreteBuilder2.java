package com.patterns.builder;

public class ConcreteBuilder2 extends Builder {

    private Product mProduct = new Product();

    @Override
    public void buildPartA() {
        mProduct.add("ConcreteBuilder2 Part A");
    }

    @Override
    public void buildPartB() {
        mProduct.add("ConcreteBuilder2 Part B");
    }

    @Override
    public Product getResult() {
        return mProduct;
    }

}
