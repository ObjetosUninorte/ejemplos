package com.uninorte.uicomponents;

import java.util.ArrayList;

abstract public class MultiChildWidget extends Widget{
    protected ArrayList<Widget> children = new ArrayList<>();
    
    MultiChildWidget(int id, int x, int y, int width, int height) {
        super(id, x, y, width, height);
    }

    public void addChild(Widget child) {
        children.add(child);
    }

    public void removeChild(Widget child) {
        children.remove(child);
    }

    public void removeAllChildren() {
        children.clear();
    }

    public ArrayList<Widget> getChildren() {
        return children;
    }

    public Widget findChild(int id) {
        for (Widget child : children) {
            if (child.getId() == id) {
                return child;
            }
        }
        return null;
    }
    
}
