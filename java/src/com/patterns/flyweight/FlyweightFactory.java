package com.patterns.flyweight;

import java.util.HashMap;

public class FlyweightFactory {

    private HashMap<String, Flyweight> mHashMap = new HashMap<String, Flyweight>();

    public FlyweightFactory() {
        mHashMap.put("X", new SharedConcreteFlyweight());
        mHashMap.put("Y", new SharedConcreteFlyweight());
        mHashMap.put("Z", new SharedConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return mHashMap.get(key);
    }

}
