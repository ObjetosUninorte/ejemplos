/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author administrador
 */
public abstract class Forma {
    
    private String color;
    private int area;
    private Touch touch;

    public Forma(String color) {
        this.color = color;
    }
    
    public int getArea(){
        return area;
    }
    
    public void setTouch(Touch t){
        touch = t;
    }
    
    private void recibirTouch(String posicion){
        if (touch != null)
           touch.onTouch(posicion);
    }
    
    
    public abstract int calcularArea();
    
    
    interface Touch {
        public void onTouch(String posicion);
    }
    
}
