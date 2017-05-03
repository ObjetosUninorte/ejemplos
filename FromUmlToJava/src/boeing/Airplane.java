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
public class Airplane {
    private Team team;
    private ArrayList<Component> components;

    public Airplane(Team team) {
        this.team = team;
        Component x = new Component(this);
        Component y = new Component(this);
        this.components.add(x);
        this.components.add(y);
    }

    
    
}
