/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mismascotas;

/**
 *
 * @author augustosalazar
 */
public class Dueño {
    
    int id;
    Perro perro;

    public Dueño(int id, Perro perro) {
        this.id = id;
        this.perro = perro;
    }
    
    public boolean perrosMayoresEdad(int x){
        if (perro.edad > x){
            return true;
        }
        return false;
    }
    
    
}
