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
        Carro carro = new Carro(new Llanta(), new Llanta(), new Llanta(), new Llanta());
        return carro;
    }
    
}
