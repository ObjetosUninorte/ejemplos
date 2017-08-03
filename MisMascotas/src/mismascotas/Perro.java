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
public class Perro {
    
    String nombre;
    Genero genero;
    Raza raza;
    int edad;

    public Perro(String nombre, Genero genero, Raza raza, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.raza = raza;
        this.edad = edad;
    }
    
    
    
}
