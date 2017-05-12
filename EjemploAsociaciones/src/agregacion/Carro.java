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

    public Carro(Llanta l1, Llanta l2, Llanta l3, Llanta l4) {
        llantas = new ArrayList<>();
        llantas.add(l1);
        llantas.add(l2);
        llantas.add(l3);
        llantas.add(l4);
    }

    public void cambiarLlanta(Llanta llantaNueva) {
        llantas.remove(0);
        llantas.add(llantaNueva);
    }

    public void cambiarLlantas(ArrayList<Llanta> llantaNuevas) {
        this.llantas = llantaNuevas;
    }

    public void cambiarLlantas(Llanta l1, Llanta l2, Llanta l3, Llanta l4) {
        llantas.clear();
        llantas.add(l1);
        llantas.add(l2);
        llantas.add(l3);
        llantas.add(l4);
    }
    
    public void revisarLlantas(){
        for (Llanta llanta:llantas){
            llanta.revisarAire();
        }
    }

}
