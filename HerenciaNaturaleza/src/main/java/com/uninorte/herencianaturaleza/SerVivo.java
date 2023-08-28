/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uninorte.herencianaturaleza;

/**
 *
 * @author augustosalazar
 */
public class SerVivo extends Ser {

    private boolean estaVivo;
    private String nombre;
    
    public SerVivo(String nombre) {
        System.out.println("Soy un ser vivo y me llaman " + nombre);
        this.nombre = nombre;
        nacer();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean estaVivo() {
        return estaVivo;
    }
    
    private void nacer(){
        estaVivo = true;
    }

    public void morir(){
        estaVivo = false;
    }

    public void alimentarse(){
        System.out.println("Soy un ser vivo "+nombre+" y me alimento");
    }

    public void reproducirse(){
        System.out.println("Soy un ser vivo "+nombre+" y me reproduzco");
    }

    public void respirar(){
        System.out.println("Soy un ser vivo "+nombre+" y respiro");
    }


    
    
}
