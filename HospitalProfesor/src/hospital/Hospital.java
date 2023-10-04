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
public class Hospital {

    private ArrayList<Ward> wards = new ArrayList<>();
    private ArrayList<Team> teams = new ArrayList<>();
    //private ArrayList<Patient> patients = new ArrayList<>();
    
    public Hospital() {
    }
    
    public void agregarTeam(int id, int idConsultantDoctor ){
        ConsultantDoctor consultantDoctor = new ConsultantDoctor(idConsultantDoctor);
        Team team = new Team(id,consultantDoctor);
        teams.add(team);
        consultantDoctor.setTeam(team);
        consultantDoctor.setLeaderOf(team);
    }
    
    public void agregarWard(int id){
        Ward w = new Ward(id);
        wards.add(w);
    }
    
    public void agregarJuniorDoctor(Team team,int id){
        JuniorDoctor jd = new JuniorDoctor(id,team);
        team.agregarDoctor(jd);
    }
    
    public Team getTeam(int id){
         return teams.stream().filter(team -> team.getId() == id).findFirst().orElse(null);
         
        //teams.forEach((n) -> n.getId() == id ? return item);
        //        for (Team team : teams) {
        //            if (team.getId() == id){
        //                return team;
        //            }
        //        }
        //        return null;
    }
    
    public Ward getWard(int id){
        for (Ward ward : wards) {
            if (ward.getId() == id){
                return ward;
            }
        }
        return null;
    }
    
    public Patient getPaciente(int id){
        Patient p;
        for (Ward ward : wards) {
            p = ward.getPatient(id);
            if (p != null){
                return p;
            }
        }
        return null;
    }
    
    public void agregarPaciente(Ward ward, Team team,int id){
        Patient p = new Patient(id, ward, team);
        //patients.add(p);
        ward.agregarPaciente(p);
        team.agregarPaciente(p);
    }
    


    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        
        hospital.agregarTeam(0, 0+10); // 0 es el id del equipo, id del equipo mas 10 es el id del ConsultantDoctor
        hospital.agregarJuniorDoctor(hospital.getTeam(0), 0+1); // recibe el equipo, el id del equipo mas 20 es el id del doctor 
        hospital.agregarJuniorDoctor(hospital.getTeam(0), 0+2);
        hospital.agregarJuniorDoctor(hospital.getTeam(0), 0+3);
        hospital.agregarJuniorDoctor(hospital.getTeam(0), 0+4);
        
        hospital.agregarTeam(100, 100+10);
        hospital.agregarJuniorDoctor(hospital.getTeam(100), 100+1);
        hospital.agregarJuniorDoctor(hospital.getTeam(100), 100+2);
        hospital.agregarJuniorDoctor(hospital.getTeam(100), 100+3);
        hospital.agregarJuniorDoctor(hospital.getTeam(100), 100+4);

        hospital.agregarTeam(200, 200+10);
        hospital.agregarJuniorDoctor(hospital.getTeam(200), 200+1);
        hospital.agregarJuniorDoctor(hospital.getTeam(200), 200+2);
        hospital.agregarJuniorDoctor(hospital.getTeam(200), 200+3);
        hospital.agregarJuniorDoctor(hospital.getTeam(200), 200+4);
        
        hospital.agregarWard(10);   
        hospital.agregarPaciente(hospital.getWard(10),hospital.getTeam(0),0+10); //recibe el ward y el id del paciente que vamos a agregar
        hospital.asignarPacienteDoctor(hospital.getPaciente(0+10), 1);    // el primer parametro es es id del paciente
                                                    // el id del doctor es, el id del team del paciente mas el numero que le pasamos en esta función
        hospital.asignarPacienteDoctor(hospital.getPaciente(0+10), 2);
        hospital.asignarCita(hospital.getPaciente(0+10), 2); //los valores de la funcion son los mismos que en asignarPacienteDoctor
        hospital.asignarCita(hospital.getPaciente(0+10), 2);
        hospital.asignarCita(hospital.getPaciente(0+10), 2);
        
        hospital.agregarPaciente(hospital.getWard(10),hospital.getTeam(100), 1+10);
        hospital.asignarPacienteDoctor(hospital.getPaciente(1+10), 1);
        hospital.agregarPaciente(hospital.getWard(10),hospital.getTeam(100), 2+10);
        hospital.asignarPacienteDoctor(hospital.getPaciente(2+10), 1);
        hospital.asignarCita(hospital.getPaciente(2+10), 1);
        hospital.asignarCita(hospital.getPaciente(2+10), 1);
        hospital.asignarCita(hospital.getPaciente(2+10), 1);
        hospital.asignarCita(hospital.getPaciente(2+10), 1);
        hospital.asignarPacienteDoctor(hospital.getPaciente(2+10), 2);
        hospital.asignarPacienteDoctor(hospital.getPaciente(2+10), 3);
        hospital.asignarCita(hospital.getPaciente(2+10), 3);
        hospital.asignarCita(hospital.getPaciente(2+10), 3);
        hospital.agregarPaciente(hospital.getWard(10),hospital.getTeam(0), 3+10);
        hospital.asignarPacienteDoctor(hospital.getPaciente(3+10), 1);
        hospital.asignarCita(hospital.getPaciente(3+10), 1);
        
//        hospital.agregarWard(50);
//        hospital.agregarPaciente(hospital.getWard(50),hospital.getTeam(0), 0+50);
//        hospital.asignarPacienteDoctor(hospital.getPaciente(0+50), 1);
//        hospital.asignarPacienteDoctor(hospital.getPaciente(0+50), 2);
//        hospital.asignarCita(hospital.getPaciente(0+50), 1);
//        hospital.asignarCita(hospital.getPaciente(0+50), 1);
//        hospital.asignarCita(hospital.getPaciente(0+50), 1);
//        hospital.asignarPacienteDoctor(hospital.getPaciente(0+50), 3);
//        hospital.asignarPacienteDoctor(hospital.getPaciente(0+50), 4);
//        hospital.agregarPaciente(hospital.getWard(50),hospital.getTeam(100), 1+50);
//        hospital.asignarPacienteDoctor(hospital.getPaciente(1+50), 1);
//        hospital.agregarPaciente(hospital.getWard(50),hospital.getTeam(200), 2+50);
//        hospital.asignarPacienteDoctor(hospital.getPaciente(2+50), 1);
//        hospital.asignarPacienteDoctor(hospital.getPaciente(2+50), 2);
//        hospital.agregarPaciente(hospital.getWard(50),hospital.getTeam(0),3+50); 
//        hospital.asignarPacienteDoctor(hospital.getPaciente(3+50), 3);
//        hospital.asignarCita(hospital.getPaciente(3+50), 3);
//        hospital.asignarCita(hospital.getPaciente(3+50), 3);
//        hospital.asignarCita(hospital.getPaciente(3+50), 3);
//        hospital.asignarCita(hospital.getPaciente(3+50), 3);
//        hospital.asignarCita(hospital.getPaciente(3+50), 3);
        
        
        System.out.println("Número de doctores por paciente");
        hospital.numeroDoctoresPaciente();
        
        System.out.println("Número de pacientes por team");
        hospital.numeroPacientesTeam();
        
        System.out.println("Relación de citas en el sistema ");
        hospital.relacionCitas();
        
    }

    public void numeroDoctoresPaciente() {
        
        for (Team team : teams) {
            team.numeroDoctoresPaciente();
        }
        

    }

    public void asignarPacienteDoctor(Patient paciente, int i) {
        Team t = paciente.getTeam();
        Doctor d = t.getDoctor(i+t.getId());
        paciente.agregarDoctor(d);
    }

    public void numeroPacientesTeam() {
    
        for (Team team : teams) {
            System.out.println("Team "+team.getId()+ " tiene "+team.getNumeroPacientes());
        }
    
    }

    public void asignarCita(Patient paciente, int i) {
        Team t = paciente.getTeam();
        Doctor d = t.getDoctor(i+t.getId());
        Appoiment a = new Appoiment(paciente.getId()+d.getId(),d,paciente);
    }

    private void relacionCitas() {
        
        for (Team team : teams) {
            team.relacionCitas();
        }
                

    }


    
}
