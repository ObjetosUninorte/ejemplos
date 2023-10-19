package com.uninorte.aeropuerto;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Equipo {
    private int id;
    private ArrayList<Equipo> equipos = new ArrayList<Equipo>();
    private Equipo equipoMadre;
    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    private ArrayList<Avion> aviones = new ArrayList<Avion>();
    
    Equipo(int id) {
        this.id = id;
    }

    public void agregarAvion(Avion avion) {
        aviones.add(avion);
    }
}
