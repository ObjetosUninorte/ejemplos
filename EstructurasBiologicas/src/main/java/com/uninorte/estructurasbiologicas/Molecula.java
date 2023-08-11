package com.uninorte.estructurasbiologicas;

/**
 *
 * @author augustosalazar
 */
public class Molecula {
    
    private final int cargaProteinica;
    private final Categoria categoria;

    public Molecula(int cargaProteinica, Categoria categoria) {
        this.cargaProteinica = cargaProteinica;
        this.categoria = categoria;
    }

    public int getCargaProteinica() {
        return cargaProteinica;
    }

    public Categoria getCategoria() {
        return categoria;
    }
 }
