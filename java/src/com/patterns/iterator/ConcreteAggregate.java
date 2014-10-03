package com.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {

    private List<Object> mList = new ArrayList<Object>();

    public List<Object> getList() {
        return mList;
    }

    public void addObject(Object object) {
        mList.add(object);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

}
