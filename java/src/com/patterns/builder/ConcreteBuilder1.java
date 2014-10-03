package com.patterns.builder;

public class ConcreteBuilder1 extends Builder {

    private Product mProduct = new Product();

    @Override
    public void buildPartA() {
        mProduct.add("ConcreteBuilder1 Part A");
    }

    @Override
    public void buildPartB() {
        mProduct.add("ConcreteBuilder1 Part B");
    }

    @Override
    public Product getResult() {
        return mProduct;
    }

}
