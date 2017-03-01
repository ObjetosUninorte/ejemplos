/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.util.Scanner;
import modelo.Equipo;
import modelo.Portatil;
import modelo.Servidor;

/**
 *
 * @author augustosalazar
 */
public class Vista {

    private Controlador controlador;

    public Vista(Controlador controlador) {
       this.controlador = controlador;
    }
    
    public void startConsole(){
        Scanner scanner = new Scanner(System.in);
        String input;
        while(true){
            System.out.println("El menu, oprima cualquier tecla");
            input = scanner.next();
            return;
        }
    }
    
    
    public void agregarPB(){
        int idBodega = 1;
        String serialPortaril = "xx";
        String serialProcesador = "yy";
        float peso = 15f;
        
        controlador.agregarPB(idBodega,serialPortaril,serialProcesador,peso);
    }
    
    public void encontrarSerial(){
        String serial = "miSerial";
        
        Equipo e = controlador.encontrarSerial(serial);
        
        if (Portatil.class.isInstance(e)){
            Portatil p = (Portatil)e;
            System.out.println("Bodega" + p.getBodega());
            System.out.println("Peso" + p.getPeso());
        }
        if (Servidor.class.isInstance(e)){
            Servidor s = (Servidor)e;
            System.out.println("Bodega" + s.getBodega());
            System.out.println("Peso" + s.getNumeroProcesadores());
        }
    }
    
}
