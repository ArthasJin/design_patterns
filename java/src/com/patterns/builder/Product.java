package com.patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private List<String> mParts = new ArrayList<String>();

    public void add(String part) {
        if (mParts != null) {
            mParts.add(part);
        }
    }

    public void show() {
        for (String part : mParts) {
            System.out.println(part);
        }
    }
}
