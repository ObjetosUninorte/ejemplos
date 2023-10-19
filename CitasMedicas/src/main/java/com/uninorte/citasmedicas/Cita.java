package com.uninorte.citasmedicas;

public class Cita {
    private Paciente paciente;
    private Doctor doctor;

    Cita(Paciente paciente, Doctor doctor) {
        this.paciente = paciente;
        this.doctor = doctor;
        this.paciente.agregarCita(this);
        this.doctor.agregarCita(this);
    }

@Override
public String toString() {
    return "Cita [doctor=" + doctor.getId() + ", paciente=" + paciente.getId() + "]";
}
}
