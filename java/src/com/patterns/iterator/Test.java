package com.patterns.iterator;

public class Test {

    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.addObject("1");
        aggregate.addObject("3");
        aggregate.addObject("5");
        aggregate.addObject("7");
        aggregate.addObject("9");

        Iterator iterator = new ConcreteIterator(aggregate);
        Object object = iterator.first();
        System.out.println("first state = " + object);
        while (iterator.hasNext()) {
            System.out.println("current state = " + iterator.current());
            iterator.next();
        }
    }

}
