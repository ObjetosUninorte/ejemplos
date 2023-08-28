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
public class SerInerteNatural extends SerInerte {

    public SerInerteNatural(String nombre) {
        super(nombre);
    }

    SerInerteNatural(String nombre, ArrayList<SerInerte> compuestos) {
        super(nombre,compuestos);
    }
    
}
