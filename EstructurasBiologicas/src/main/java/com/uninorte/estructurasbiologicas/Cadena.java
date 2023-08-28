
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

    private Cadena(ArrayList<Molecula> listaMoleculas) {
        moleculas = new ArrayList<>();
        moleculas.addAll(listaMoleculas);
        setCategoria();
    }

    private Cadena(Molecula m1, Molecula m2, Molecula m3) {
        moleculas = new ArrayList<>();
        moleculas.add(m1);
        moleculas.add(m2);
        moleculas.add(m3);
        setCategoria();
    }

    //create a factory that gets an array of Moleculas and returns a Cadena if there are at least 3 entries
    public static Cadena createCadena(ArrayList<Molecula> listaMoleculas) {
        if (listaMoleculas.size() < 3) {
            return null;
        }
        for (Molecula molecula : listaMoleculas) {
           molecula.setEnCadena();   
        }
        return new Cadena(listaMoleculas);
    }

    //get the avarage cargaProteinica of the Moleculas in the Cadena
    public double getAverageCargaProteinica() {
        if (moleculas.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Molecula molecula : moleculas) {
            sum += molecula.getCargaProteinica();
        }
        return sum / moleculas.size();
    }

    public void setReadOnly(){
        cadenaReadOnly = true;
    }

    public boolean isReadOnly(){
        return cadenaReadOnly;
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
