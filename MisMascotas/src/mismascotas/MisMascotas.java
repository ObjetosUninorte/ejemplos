/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mismascotas;

import java.util.ArrayList;

/**
 *
 * @author augustosalazar
 */
public class MisMascotas {

    ArrayList<Dueño> dueños;
    //Dueño elDueño;

    public MisMascotas() {
        System.out.println("Creando MisMascotas");
        dueños = new ArrayList<>();
    }
    
    public void agregarDueño(Dueño dueño){
        dueños.add(dueño);
    }
    
    public Dueño buscarDueño(int id){
        
        for (Dueño d: dueños){
            if (d.id == id){
                return d;
            }
        }
        
        return null;
    }
    
    public int numeroPerrosMayoresEdad(int x){
        int count = 0;
        for (Dueño d: dueños){
            if (d.perrosMayoresEdad(x)){
               count++;
            }
        }
        return count;
    }
    

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MisMascotas misMascotas = new MisMascotas();
        for (int i = 0;i<= 30;i++){
            if(i%2 == 0){
                Perro p = new Perro("elPerro"+i, Genero.MACHO, Raza.CHANDO, i);
                misMascotas.agregarDueño(new Dueño(i,p));
            }else{ 
                Perro p = new Perro("laPerra"+i, Genero.HEMBRA, Raza.NOCHANDO, i);
                misMascotas.agregarDueño(new Dueño(i,p));
            }
        }
        System.out.println("Hay "+misMascotas.numeroPerrosMayoresEdad(10)+ " perros mayores de 10 años");
    }
      
    
    
}
