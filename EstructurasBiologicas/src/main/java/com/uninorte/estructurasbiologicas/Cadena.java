
package com.uninorte.estructurasbiologicas;

import java.util.ArrayList;

/**
 *
 * @author augustosalazar
 */
public class Cadena {
    private Categoria categoria;
    private ArrayList<Molecula> moleculas;
    private boolean cadenaReadOnly = false;

    private Cadena(Molecula m1, Molecula m2, Molecula m3) {
        moleculas.add(m1);
        moleculas.add(m2);
        moleculas.add(m3);
        setCategoria();
    }

    //create a factory that gets an array of Moleculas and resturns a Cadena if there are at least 3 entries
    public static Cadena createCadena(Molecula[] moleculas) {
        if (moleculas.length < 3) {
            return null;
        }
        return new Cadena(moleculas[0], moleculas[1], moleculas[2]);
    }

    public void setReadOnly(){
        cadenaReadOnly = true;
    }
   
    public Categoria getCategoria() {
        return categoria;
    }

    public ArrayList<Molecula> getMoleculas() {
        return moleculas;
    }
    
    public boolean agregarMolecula(Molecula molecula){
        if(cadenaReadOnly){
            return false;
        }
        moleculas.add(molecula);
        setCategoria();
        return true;
    }
    
    private void setCategoria(){
        int count;
        int max = 0;
        Categoria maxCategoria = Categoria.A;
        for(Molecula i : moleculas){
            count = 0;
            for (Molecula j : moleculas) {
                if(i.getCategoria() != j.getCategoria()){
                    count++;
                }
            }
            if(count > max){
                max = count;
                maxCategoria = i.getCategoria();
            }
            
        }
        categoria = maxCategoria;
    }
}
