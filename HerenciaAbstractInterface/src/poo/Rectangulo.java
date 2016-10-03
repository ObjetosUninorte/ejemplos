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
public class Rectangulo extends Forma{

    private int b,h;
    public Rectangulo(int b,int h) {
        super("0x00000");
        this.b = b;
        this.h = h;
    }


    @Override
    public int calcularArea() {
    
       return b*h;
    }
    
}
