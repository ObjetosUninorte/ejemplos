/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uninorte.citasmedicas;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author augustosalazar
 */
public class CitasMedicas {
    private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
    private ArrayList<Doctor> doctores = new ArrayList<Doctor>();
    private ArrayList<Cita> citas = new ArrayList<Cita>();

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);
    }

    public static void main(String[] args) {
        CitasMedicas citasMedicas = new CitasMedicas();
        for (int i = 0; i < 20; i++) {
            citasMedicas.agregarPaciente(new Paciente(i));    
        }
        for (int i = 0; i < 3; i++) {
            citasMedicas.agregarDoctor(new Doctor(i));
        }
        for (int i = 0; i < 10; i++) {
            int idPaciente = (int)(Math.random()*20);
            int idDoctor = (int)(Math.random()*3);
            citasMedicas.agregarCita(idPaciente, idDoctor);
        }
        citasMedicas.imprimirCitasPacientes();
        citasMedicas.imprimirCitasDoctores();
        
    }

    public void imprimirCitasDoctores() {
        System.out.println("Citas de doctores");
        for (Doctor d: doctores) {
            d.imprimirCitas();
        }
    }

    public void imprimirCitasPacientes() {
        System.out.println("Citas de pacientes");
        for (Paciente p: pacientes) {
            p.imprimirCitas();
        }
    }

    public void agregarCita(int idPaciente, int idDoctor) {
        Doctor doctor = buscarDoctor(idDoctor);
        Paciente paciente = buscarPaciente(idPaciente);
        if (doctor != null && paciente != null) {
            Cita cita = new Cita(paciente, doctor);
            citas.add(cita);
        } else {
            System.out.println("No se pudo crear la cita paciente "+idPaciente+ " doctor "+idDoctor);}
    }

    public Doctor buscarDoctor(int i) {
        for(Doctor doctor: doctores) {
            if (doctor.getId() == i) {
                return doctor;
            }
        }
        System.out.println("No se encontro el doctor "+i);
        return null;
    }

    public Paciente buscarPaciente(int i) {
        for(Paciente paciente: pacientes) {
            if (paciente.getId() == i) {
                return paciente;
            }
        }
        System.out.println("No se encontro el paciente "+i);
        return null;
    }

    public int getDoctorCount() {
        return doctores.size();
    }

    public int getPatientCount() {
        return pacientes.size();
    }

    public int getCitasCountDoctor(int i) {
        return buscarDoctor(i).getCitasCount();
    }

    public int getCitasCountPatient(int i) {
        return buscarPaciente(i).getCitasCount();
    }


}
