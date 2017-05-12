/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

import java.util.ArrayList;

/**
 *
 * @author augustosalazar
 */
public class Humano {
    
    private Corazon corazon;
    private Higado higado;
    private ArrayList<Riñon> riñones;
    

    public Humano() {
        
        Corazon corazon = new Corazon();
        Higado higado = new Higado();
        riñones.add(new Riñon());
        riñones.add(new Riñon());
        
    }
    
    // vamos a suponer que se puede realizar un transplante de higado
    public void setHigado(Higado higado) {
        this.higado = higado;
    }
    
    // vamos a suponer que la persona despues de morir puede donar su corazon

    public Corazon getCorazon() {
        return corazon;
    }
    
    // vamos a suponer que se puede extraer un riñon
    
    public Riñon getRiñon(){
        // verificamos que tenga dos
        if (riñones.size() == 2){
            Riñon r = riñones.get(1);
            riñones.remove(r);
            return r;
        }
        return null;
    }
}
