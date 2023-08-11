
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

    public Cadena(Molecula m1, Molecula m2, Molecula m3) {
        moleculas.add(m1);
        moleculas.add(m2);
        moleculas.add(m3);
        setCategoria();
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
        categoria = Categoria.A;
    }
}
