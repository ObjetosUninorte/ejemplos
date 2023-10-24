package com.uninorte.aeropuerto;

public class Componente {
    private int id;
    private Avion avion;

    public Componente(int id, Avion avion) {
        this.id = id;
        this.avion = avion;
    }


    public Avion getAvion() {
        return avion;
    }
    
}
