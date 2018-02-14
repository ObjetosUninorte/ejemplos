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
public class Tablero {

    ArrayList<Casilla> casillas;

    public Tablero() {
        casillas = new ArrayList<>();
        boolean color = true;
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                Casilla c
                        = new Casilla(color == true ? Color.negro : Color.blanco, new Jugada(i, j));
                color = !color;
                casillas.add(c);
            }

        }

    }

    public int obtenerCasillasOcupadas() {
        int count = 0;
        for (Casilla casilla : casillas) {
            if (casilla.estaOcupada()) {
                count++;
            }
        }

        return count;
    }

    void agregarPieza(Pieza p) {
        for (Casilla casilla : casillas) {
            if (casilla.posicion.equals(p.posF)) {
                casilla.agregarPieza(p);
            }
        }
    }

    boolean validaJugada(Jugada jugada) {
        Casilla casilla = getCasilla(jugada);
        switch (jugada.pieza.tipo) {

            case peon:
                if (jugada.esDiagonal()) {
                    if (casilla.validarKill(jugada)) {
                        return true;
                    } else {
                        if (!casilla.estaOcupada()) {
                            return true;
                        }
                    }
                }
                break;

            case torre:
                if (!casilla.estaOcupada()) {
                    return true;
                }
                if (casilla.validarKill(jugada)) {
                    return true;
                }
                break;

        }
        return false;
    }

    Casilla getCasilla(Jugada jugada) {
        for (Casilla casilla : casillas) {
            if (casilla.posicion.equals(jugada)) {
                return casilla;
            }
        }
        return null;
    }
}
