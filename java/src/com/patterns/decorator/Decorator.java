package com.patterns.decorator;

public abstract class Decorator extends Component {
    private Component mComponent = null;

    public Component getComponent() {
        return mComponent;
    }

    public void setComponent(Component component) {
        this.mComponent = component;
    }

    public void operation() {
        if (mComponent != null) {
            mComponent.operation();
        }
    }
}
