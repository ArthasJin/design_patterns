package com.patterns.iterator;

public class ConcreteIterator extends Iterator {

    private ConcreteAggregate mAggregate = null;

    private int mCurrent = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.mAggregate = aggregate;
    }

    @Override
    public Object first() {
        return mAggregate.getList().get(0);
    }

    @Override
    public Object next() {
        Object object = null;
        mCurrent++;
        if (mCurrent < mAggregate.getList().size()) {
            object = mAggregate.getList().get(mCurrent);
        }
        return object;
    }

    @Override
    public boolean hasNext() {
        return mCurrent >= mAggregate.getList().size() ? false : true;
    }

    @Override
    public Object current() {
        return mAggregate.getList().get(mCurrent);
    }

}
