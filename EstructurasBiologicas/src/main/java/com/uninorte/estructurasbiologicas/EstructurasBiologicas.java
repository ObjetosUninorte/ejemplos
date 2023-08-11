package com.uninorte.estructurasbiologicas;

import java.util.ArrayList;

/**
 *
 * @author augustosalazar
 */
public class EstructurasBiologicas {
    private ArrayList<Bloque> bloques;
    private ArrayList<Molecula> moleculas;

    EstructurasBiologicas() {
        bloques = new ArrayList<>();
        moleculas = new ArrayList<>();
    }

    public void agregarMolecula(int carge, Categoria categoria) {
         moleculas.add(new Molecula(carge, categoria));
    }

    public void agregarRandomMolecula() {
         moleculas.add(Molecula.createRandom());
    }

    public Cadena createCadena(Molecula m1, Molecula m2, Molecula m3) {
        return Cadena.createCadena( new Molecula[]{m1, m2, m3});
    }

    public boolean createBloque(Cadena c1, Cadena c2, Cadena c3) {
        Bloque bloque = Bloque.createBloque(c1, c2, c3);
        if (bloque != null) {
            bloques.add(bloque);
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        EstructurasBiologicas eb = new EstructurasBiologicas();
        for (int i = 0; i < 100; i++) {
            eb.agregarRandomMolecula();
        }

    }
}
