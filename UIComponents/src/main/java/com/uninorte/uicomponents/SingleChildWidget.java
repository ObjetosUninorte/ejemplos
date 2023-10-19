package com.uninorte.uicomponents;

abstract public class SingleChildWidget extends Widget{
    protected Widget child;
    
    SingleChildWidget(int id, int x, int y, int width, int height) {
        super(id, x, y, width, height);
    }

    SingleChildWidget(int id, int x, int y, int width, int height, Widget child) {
        super(id, x, y, width, height);
        this.child = child;
    }

    public Widget getChild() {
        return child;
    }

    public void setChild(Widget child) {
        this.child = child;
    }
}
