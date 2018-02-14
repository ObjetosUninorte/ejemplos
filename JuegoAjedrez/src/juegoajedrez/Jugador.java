/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoajedrez;

import java.util.ArrayList;

/**
 *
 * @author augustosalazar
 */
public class Jugador {
    Color color;
    Tablero tablero;
    ArrayList<Pieza> piezas;

    public Jugador(Color color, Tablero tablero) {
        this.color = color;
        this.tablero = tablero;
        piezas = new ArrayList<>();
    }

    void agregarPieza(Pieza p) {
        piezas.add(p);
    }

    int obtenerNumeroJuagadas() {
        int count = 0;
        ArrayList<Jugada> jugadas;
        for (Pieza p : piezas) {
            jugadas = p.obtenerJuagadas();
            for (Jugada jugada : jugadas) {
                if (tablero.validaJugada(jugada)){
                    count++;
                }
            }
        }
        
        return 0;
    }
    
    
    
}
