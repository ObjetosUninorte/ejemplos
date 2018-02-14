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
public class JuegoAjedrez {

    Tablero tablero;
    ArrayList<Pieza> piezas;
    ArrayList<Jugador> jugadores;

    public JuegoAjedrez() {
        piezas = new ArrayList<>();
        jugadores = new ArrayList<>();
        tablero = new Tablero();
        System.out.println("casillas ocupadas "+tablero.obtenerCasillasOcupadas());
        Jugador j = new Jugador(Color.negro, tablero);
        System.out.println("Jugador "+j.color.toString());
        jugadores.add(j);
        
        for (int i = 0; i < 8; i++) {
            Pieza p = new Pieza(Tipo.peon,new Jugada(2,1+i),j.color);
            piezas.add(p);
            j.agregarPieza(p); 
            tablero.agregarPieza(p);
        }
        
        Pieza p = new Pieza(Tipo.torre,new Jugada(1,1),j.color);
        piezas.add(p);
        j.agregarPieza(p); 
        tablero.agregarPieza(p);
        
        p = new Pieza(Tipo.torre,new Jugada(1,8),j.color);
        piezas.add(p);
        j.agregarPieza(p); 
        tablero.agregarPieza(p);
        
        j = new Jugador(Color.blanco, tablero);
        System.out.println("Jugador "+j.color.toString());
        jugadores.add(j);

        for (int i = 0; i < 8; i++) {
            p = new Pieza(Tipo.peon,new Jugada(7,1+i),j.color);
            piezas.add(p);
            j.agregarPieza(p); 
            tablero.agregarPieza(p);
        }
        
        p = new Pieza(Tipo.torre,new Jugada(8,1),j.color);
        piezas.add(p);
        j.agregarPieza(p); 
        tablero.agregarPieza(p);
        
        p = new Pieza(Tipo.torre,new Jugada(8,8),j.color);
        piezas.add(p);
        j.agregarPieza(p); 
        tablero.agregarPieza(p);
        
        System.out.println("casillas ocupadas "+tablero.obtenerCasillasOcupadas());
        
        for (Jugador jugador : jugadores) {
            System.out.println("Núnumero de jugadas "+jugador.obtenerNumeroJuagadas());
            
        }
        
        
        System.out.println("");
      
    }
    
    
    
    public static void main(String[] args) {
        JuegoAjedrez elJuego = new JuegoAjedrez();
        
    }
    
    
}
