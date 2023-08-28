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
public class SerInerteArtificial extends SerInerte {
    
    SerInerteArtificial(String nombre, ArrayList<SerInerte> compuestos) {
        super(nombre,compuestos);
    }

    public void hacerAlgo(){
        System.out.println("Soy un ser inerte artificial y hago algo");
    }
}
