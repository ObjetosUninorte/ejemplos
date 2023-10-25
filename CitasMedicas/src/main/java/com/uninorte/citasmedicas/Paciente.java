package com.uninorte.citasmedicas;

import java.util.ArrayList;

public class Paciente extends Persona{
    private ArrayList<Cita> citas = new ArrayList<Cita>();

    public Paciente(int id) {
        super(id);
        //TODO Auto-generated constructor stub
    }

    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    public void imprimirCitas() {
        for (Cita cita : citas) {
            System.out.println(cita);
        }
    }

    public int getCitasCount() {
        return citas.size();
    }
    
}
