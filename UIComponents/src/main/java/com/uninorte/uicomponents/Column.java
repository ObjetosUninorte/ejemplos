package com.uninorte.uicomponents;

public class Column extends MultiChildWidget {

    public Column(int id, int x, int y, int width, int height) {
        super(id, x, y, width, height);
        System.out.println("Creating a column with id: " + id);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a column");
    }

    public void doSomethingColumnsish() {
        System.out.println("I'm a column");
    }
    
}
