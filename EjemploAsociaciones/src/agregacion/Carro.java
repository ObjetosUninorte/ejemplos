/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacion;

import java.util.ArrayList;

/**
 *
 * @author augustosalazar
 */
public class Carro {
    
    private ArrayList<Llanta> llantas;

    public Carro(Llanta l1,Llanta l2,Llanta l3,Llanta l4) {
        llantas = new ArrayList<>();
        llantas.add(l1);
        llantas.add(l2);
        llantas.add(l3);
        llantas.add(l4);
    }
    
   
    
}
