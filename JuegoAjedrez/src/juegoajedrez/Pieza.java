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
public class Pieza {

    Tipo tipo;
    Jugada posI;
    Jugada posF;
    Color color;

    public Pieza(Tipo tipo, Jugada posI, Color color) {
        this.tipo = tipo;
        this.posI = posI;
        this.posF = posI;
        this.color = color;
    }

    ArrayList<Jugada> obtenerJuagadas() {
        ArrayList<Jugada> jugadas = new ArrayList<>();

        switch (tipo) {
            case peon:

                break;

            case torre:

                break;
        }

        return jugadas;
    }

}
