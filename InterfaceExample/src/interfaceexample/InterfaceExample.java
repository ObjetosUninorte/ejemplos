/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexample;

/**
 *
 * @author augustosalazar
 */
public class InterfaceExample implements Adaptador.MyInterface {

    
    Adaptador adaptador;

    public InterfaceExample() {
        
        adaptador = new Adaptador();
        
        adaptador.setmMyInterface(this);
        
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }

    @Override
    public void interfaceMethod(int x) {
        // este metodo será llamado por el adaptador
    }
    
}
