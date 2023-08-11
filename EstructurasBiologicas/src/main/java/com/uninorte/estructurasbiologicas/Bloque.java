
package com.uninorte.estructurasbiologicas;

import java.util.ArrayList;

/**
 *
 * @author augustosalazar
 */
public class Bloque {
    private ArrayList<Cadena> cadenas;

    private Bloque(Cadena c1, Cadena c2, Cadena c3) {
        cadenas = new ArrayList<>();
        c1.setReadOnly();
        c2.setReadOnly();
        c3.setReadOnly();
        cadenas.add(c1);
        cadenas.add(c2);
        cadenas.add(c3);
    }

    //create factory constructor that gets 3 Cadenas and returns a Bloque
    public static Bloque createBloque(Cadena c1, Cadena c2, Cadena c3) {
        // verify that the 3 Cadenas have different categories
        if (c1.getCategoria() == c2.getCategoria() || c1.getCategoria() == c3.getCategoria() || c2.getCategoria() == c3.getCategoria()) {
            return null;
        }
        return new Bloque(c1, c2, c3);
    }
    
    
}
