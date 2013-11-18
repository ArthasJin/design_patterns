package com.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> mList = null;

    public Composite(String name) {
        super(name);
        mList = new ArrayList<Component>();
    }

    @Override
    public void add(Component component) {
        if (mList != null) {
            mList.add(component);
        }
    }

    @Override
    public void remove(Component component) {
        if (mList != null) {
            mList.remove(component);
        }
    }

    @Override
    public void display(int depth) {
        StringBuffer buff = new StringBuffer();
        for (int i = 0; i < depth; i++) {
            buff.append('-');
        }
        for (Component component : mList) {
            component.display(depth + 2);
        }
    }

}
