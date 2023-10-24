package com.uninorte.uicomponents;

abstract public class Widget {
    private int id;
    private int x,y;
    private int width,height;

    Widget(int id, int x, int y, int width, int height) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        //System.out.println("Creating a widget with id: " + id);
    }

    abstract public void draw();

    public int getId() {
        return 0;
    }


}
