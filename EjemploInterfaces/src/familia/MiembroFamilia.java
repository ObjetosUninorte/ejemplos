/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familia;

/**
 *
 * @author augustosalazar
 */
public class MiembroFamilia {
    private int casa;
    private int perro;
    private int carro;
    
    
    
    public interface AdministrarCarro {
        
        public void manejarCarro();
        public void lavarCarro();
      
    }
    
    public interface AdministrarPerro {
        
        public void sacarPerro();
        public void bañarPerro();
        public void alimentarPerro();
        public void consentirPerro();
    }
}
