/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacion;

/**
 *
 * @author augustosalazar
 */
public class Fabrica {
    
    public Carro construircarro(){
        Llanta l1 = new Llanta();
        Llanta l2 = new Llanta();
        Llanta l3 = new Llanta();
        Llanta l4 = new Llanta();
        Carro carro = new Carro(l1, l2, l3, l4);
        return carro;
    }
    
}
