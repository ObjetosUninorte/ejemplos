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
public class Jugada {
    int x;
    int y;
    Pieza pieza;
    Jugador jugador;

    public Jugada(int x, int y) {
        this.x = x;
        this.y = y;

    }
    
     public boolean equals(Jugada obj) {
       if (obj.x == x && obj.y == y){
           return true;
       }
       return false;
    }

    boolean esDiagonal() {
        return false;
    }
}
