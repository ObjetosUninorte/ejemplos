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
public class Employee {
    ArrayList<Team> teams;

    public Employee() {
        teams = new ArrayList<>();
    }
    
    private void addTeam(Team team){
        teams.add(team);
    }
    
}
