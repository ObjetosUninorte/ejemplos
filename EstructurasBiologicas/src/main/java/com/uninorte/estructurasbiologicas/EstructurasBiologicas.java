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
        for (int i = 0; i < 10; i++) {
            eb.agregarRandomMolecula();
        }
        for (int i = 0; i < 10; i++) {
            eb.createBloque(eb.createCadena(eb.moleculas.get(i), eb.moleculas.get(i + 1), eb.moleculas.get(i + 2)),
                    eb.createCadena(eb.moleculas.get(i + 3), eb.moleculas.get(i + 4), eb.moleculas.get(i + 5)),
                    eb.createCadena(eb.moleculas.get(i + 6), eb.moleculas.get(i + 7), eb.moleculas.get(i + 8)));
        }
    }
}
