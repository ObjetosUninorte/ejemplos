package com.uninorte.uicomponents;

public class Button extends SingleChildWidget implements Interaction{

    Button(int id, int x, int y, int width, int height, Widget child) {
        super(id, x, y, width, height, child);
        System.out.println("Creating a button with id: " + id);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a button");
        child.draw();
    }

    @Override
    public void onClick() {
        System.out.println("Button clicked");
    }

    @Override
    public void onLongClick() {
        System.out.println("Button long clicked");
    }
    
}
