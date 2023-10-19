package com.uninorte.aeropuerto;

import java.util.ArrayList;

public class Empleado {
    private int id;
    private ArrayList<Equipo> equipos = new ArrayList<Equipo>();

    public Empleado(int id) {
        this.id = id;
    }
}
