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
public class Doctor extends Identification {
    
    private Team team;
    private ArrayList<Appoiment> appoiments = new ArrayList<>();
    
    public Doctor(int id) {
        super(id);
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
    
    public void agregarAppoiment(Appoiment a){
        appoiments.add(a);
    }
   
 
}
