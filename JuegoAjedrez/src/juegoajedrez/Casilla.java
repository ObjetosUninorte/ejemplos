/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoajedrez;

/**
 *
 * @author augustosalazar
 */
public class Casilla {
    Color color;
    Pieza pieza;
    Jugada posicion;

    public Casilla(Color color, Jugada posicion) {
        this.color = color;
        this.posicion = posicion;
    }
    
    public boolean estaOcupada(){
        if (pieza == null){
            return false;
        }
        return true;
    }

    void agregarPieza(Pieza p) {
       pieza = p; 
    }

    boolean validarKill(Jugada jugada){
        if (jugada.pieza.color != pieza.color ){
            return true;
        }
        return false;
    }
    
    
}
