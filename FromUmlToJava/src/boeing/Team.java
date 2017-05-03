/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boeing;

import java.util.ArrayList;

/**
 *
 * @author augustosalazar
 */
public class Team {
   private ArrayList<Team> subteam;
   private Team team;
   private ArrayList<Employee> employees;
   private ArrayList<Airplane> airplanes;

    public Team(ArrayList<Team> subteam, Employee employee,Airplane airplane ) {
        this.subteam = subteam;
        this.employees.add(employee);
        this.airplanes.add(airplane);
    }

    public void setTeam(Team team) {
        this.team = team;
    }
    
    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
  
    public void addAirplane(Airplane airplane){
        this.airplanes.add(airplane);
    }
}
