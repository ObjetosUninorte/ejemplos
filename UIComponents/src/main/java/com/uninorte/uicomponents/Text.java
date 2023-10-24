package com.uninorte.uicomponents;

public class Text extends SingleChildWidget{

    public Text(int id, int x, int y, int width, int height) {
        super(id, x, y, width, height);
        //System.out.println("Creating a text with id: " + id);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a text");
    }
    
    
}
