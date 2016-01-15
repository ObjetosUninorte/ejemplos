/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aurorita;

/**
 *
 * @author Administrador
 */
public class Aurorita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ES es = new ES();
        Evaluacion eval = new Evaluacion("Parcial",0.3f);
        
        eval.leerNotas(10);
        
        
        es.escribir("El promedio es "+eval.calcPromedio());
        
        
    }
    
}
