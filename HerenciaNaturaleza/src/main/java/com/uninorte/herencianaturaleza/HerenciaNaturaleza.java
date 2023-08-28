/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uninorte.herencianaturaleza;

import java.util.ArrayList;

/**
 *
 * @author augustosalazar
 */
public class HerenciaNaturaleza {

    public static void main(String[] args) {
        Ser ser = new Ser();
        SerInerte serInerte = new SerInerte("SerInerte");
        SerInerteNatural serInerteNatural = new SerInerteNatural("SerInerteNatural");
        ArrayList<SerInerte> compuestos = new ArrayList<>();
        compuestos.add(serInerte);
        SerInerteArtificial serInerteArtificial = new SerInerteArtificial("SerInerteArtificial", compuestos);

        SerVivo serVivo = new SerVivo("SerVivo");
        Animal serVivoAnimal = new Animal("Animal");
        Vegetal serVivoVegetal = new Vegetal("Vegetal");
        Hongo serVivoHongos = new Hongo("Hongos");
        Monera serVivoMonera = new Monera("Monera");
        Protista serVivoProtista = new Protista("Protista");
    }
}
