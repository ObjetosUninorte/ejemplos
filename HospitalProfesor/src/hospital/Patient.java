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
public class Patient extends Identification{
    
    public ConsultantDoctor consultantDoctor;
    public Ward ward;
    public Team team;
    public ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Appoiment> appoiments = new ArrayList<>();
    
    public Patient(int id,Ward ward,Team team) {
        super(id);
        this.ward = ward;
        this.team = team;
        setConsultantDoctor(team.getTeamLeader());
    }

    public ConsultantDoctor getConsultantDoctor() {
        return consultantDoctor;
    }

    private void setConsultantDoctor(ConsultantDoctor consultantDoctor) {
        this.consultantDoctor = consultantDoctor;
    }
    
    public void agregarDoctor(Doctor doctor){
       doctors.add(doctor);
    }

    public int getNumeroDoctores() {
        return doctors.size();
    }
    
    public void agregarAppoiment(Appoiment a){
        appoiments.add(a);
    }

    public Team getTeam() {
        return team;
    }
    
    public void relacionCitas(){
        System.out.println("Paciente "+getId()+ " tiene "+appoiments.size()+ " citas");
        for (Appoiment a : appoiments) {
            System.out.println("Paciente "+getId()+" cita con el doctor "+a.getDoctor().getId());
        }
    }
    
    
    
   
}
