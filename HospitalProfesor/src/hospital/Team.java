/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;

/**
 *
 * @author augustosalazar
 */
public class Team extends Identification{
    private ConsultantDoctor teamLeader;
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Patient> patients = new ArrayList<>();

    public Team(int id,ConsultantDoctor teamLeader) {
        super(id);
        this.teamLeader = teamLeader;
        teamLeader.setTeam(this);
    }

    public ConsultantDoctor getTeamLeader() {
        return teamLeader;
    }
    
    public void agregarDoctor(Doctor doctor){
        doctors.add(doctor);
        doctor.setTeam(this);
    }

    void agregarPaciente(Patient p) {
        patients.add(p);
    }
    
    public Doctor getDoctor(int id){
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id){
                return doctor;
            }
        }
        return null;
    }

    public int getNumeroPacientes() {
        return patients.size();
    }

    void numeroDoctoresPaciente() {
        for (Patient p : patients) {
            System.out.println("paciente "+p.getId()+ " tiene "+p.getNumeroDoctores());
        }
    }

    void relacionCitas() {
        for (Patient p : patients) {
            p.relacionCitas();
        }
    }
       
}
