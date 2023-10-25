package com.uninorte.citasmedicas;

import java.util.ArrayList;

public class Doctor extends Persona{

    private Especialidad especialidad;
    private ArrayList<Cita> citas = new ArrayList<Cita>();

    public Doctor(int id) {
        super(id);
        //TODO Auto-generated constructor stub
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
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
