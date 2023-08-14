package com.uninorte.estructurasbiologicas;

/**
 *
 * @author augustosalazar
 */
public class Molecula {
    
    private final int cargaProteinica;
    private final Categoria categoria;
    private boolean moleculaEnCadena = false;

    public Molecula(int cargaProteinica, Categoria categoria) {
        this.cargaProteinica = cargaProteinica;
        this.categoria = categoria;
        this.moleculaEnCadena = false;
    }

    //create a factory constructor that returns a Molecula with a random cargaProteinica and a random Categoria
    // the random category should be selected from the Categoria enum
    public static Molecula createRandom() {
        return new Molecula((int) (Math.random() * 10), Categoria.getRandomCategoria());
    }

    public int getCargaProteinica() {
        return cargaProteinica;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public boolean estaEnCadena() {
        return moleculaEnCadena;
    }

    public void setEnCadena() {
        moleculaEnCadena = true;
    }
 }
