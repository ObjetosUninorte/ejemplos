/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebathread;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author pwightman
 */
public class PruebaThread extends Thread{

    int n;
    int cont;
    
    public PruebaThread(int n){
        this.n = n;
        cont=0;
    }
    
    public void iniciar(){
        this.start();
        for(int i=0;i<n;i++){
            try {
                System.out.println("Soy el padre "+i);
                cont++;
                this.sleep(20);
            } catch (Exception ex) {ex.printStackTrace();}
        }
        System.out.println("Cont es "+cont);
    }
    
    public void run(){
        int i=0;
        for(i=0;i<n;i++){
            try {
                System.out.println("Soy el hilo "+i);
                cont++;
                this.sleep(10);
            } catch (Exception ex) {ex.printStackTrace();}
        }
        System.out.println("Cont es "+cont);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PruebaThread elHilo = new PruebaThread(100);
        
        elHilo.iniciar();
       
        
    }
}
