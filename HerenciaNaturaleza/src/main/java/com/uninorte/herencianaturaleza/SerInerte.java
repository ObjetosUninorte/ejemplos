/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uninorte.herencianaturaleza;

import java.util.ArrayList;

/**
 *
 * @author augustosalazar
 */
public class SerInerte extends Ser {
    
    private String nombre;
    private ArrayList<SerInerte> compuestos;

    public SerInerte(String nombre) {
        System.out.println("Soy un ser inerte y me llaman " + nombre);
        this.nombre = nombre;
        compuestos = new ArrayList<SerInerte>();
    }

    public SerInerte(String nombre, ArrayList<SerInerte> compuestos) {
        System.out.println("Soy un ser inerte y me llaman " + nombre);
        this.nombre = nombre;
        this.compuestos = compuestos;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
