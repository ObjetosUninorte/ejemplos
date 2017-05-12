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
public class Llanta {

    private int presionInicial;
    private int presion;

    public Llanta(int presion) {
        this.presionInicial = presion;
    }
    
    public boolean revisarAire() {
        if (presion == presionInicial){
            return true;
        } else {
            return false;
        }
    }

    public void llenarAire() {
        presion = presionInicial;
    }
    
}
