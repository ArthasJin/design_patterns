package com.patterns.visitor;

import java.util.ArrayList;

public class DataStructure {

    private ArrayList<Element> mElements = new ArrayList<Element>();

    public void attach(Element element) {
        mElements.add(element);
    }

    public void detach(Element element) {
        mElements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : mElements) {
            element.accept(visitor);
        }
    }

}
