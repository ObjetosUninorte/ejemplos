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
public class Evaluacion {
    
    private String nombre;
    private float peso;
    private Nota[] notas;
    private int numEst;
    ES es;

    public Evaluacion(String nombre, float peso) {
        this.nombre = nombre;
        this.peso = peso;
        this.numEst = 0;
        es = new ES();
    }
    
    
    public void leerNotas(int numEst){
    
        float val =0.0f;
        notas = new Nota[numEst];
        this.numEst = numEst;
        
        for(int i=0;i<numEst;i++){
            val = es.leerFloat("Ingrese la nota "+i+": ");
            notas[i] = new Nota(new Estudiante(), new Curso(), val);
            
        }
        
    }
    
    
    public float calcPromedio(){
    
        float sum=0.0f;
        
        for(int i=0;i<numEst;i++){
            sum += notas[i].getValor();
        }
        
        return sum/numEst;
        
    }
    
    
    
    
    
    
}
