package com.uninorte.uicomponents;

public class Row extends MultiChildWidget{

    Row(int id, int x, int y, int width, int height) {
        super(id, x, y, width, height);
        System.out.println("Creating a row with id: " + id);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a row");
        for ( Widget widget : children) {
            widget.draw();
        }
    }

    public void doSomethingRowish() {
        System.out.println("I'm a row");
    }
    
}
