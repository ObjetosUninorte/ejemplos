/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.uninorte.estructurasbiologicas;

/**
 *
 * @author augustosalazar
 */
public enum Categoria {
    A,
    B,
    C;

    public static Categoria getRandomCategoria() {
        // get a random number between 0 and 2 and return the corresponding Categoria
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                return Categoria.A;
            case 1:
                return Categoria.B;
            case 2:
                return Categoria.C;
            default:
                return Categoria.A;
        }
    }
}
