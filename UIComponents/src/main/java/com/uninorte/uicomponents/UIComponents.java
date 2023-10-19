
package com.uninorte.uicomponents;

public class UIComponents {

    public static void main(String[] args) {
        Button button = new Button(1, 0, 0, 100, 100, new Text(2, 0, 0, 100, 100));
       
        Row row = new Row(3, 0, 0, 100, 100);
        row.addChild(button);
        row.draw();
    }
}
