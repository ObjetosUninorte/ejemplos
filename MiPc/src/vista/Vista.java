/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;

/**
 *
 * @author augustosalazar
 */
public class Vista {

    private Controlador controlador;

    public Vista(Controlador controlador) {
       this.controlador = controlador;
    }
    
    public void agregarPB(){
        int idBodega = 1;
        String serialPortaril = "xx";
        String serialProcesador = "yy";
        float peso = 15f;
        
        controlador.agregarPB(idBodega,serialPortaril,serialProcesador,peso);
    }
    
}
