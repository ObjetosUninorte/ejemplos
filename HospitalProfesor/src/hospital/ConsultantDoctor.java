/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author augustosalazar
 */
public class ConsultantDoctor extends Doctor{
    
    private Team leaderOf;
    
    public ConsultantDoctor(int id) {
        super(id);
    }

    public Team getLeaderOf() {
        return leaderOf;
    }

    public void setLeaderOf(Team leaderOf) {
        this.leaderOf = leaderOf;
    }
    
    
    
}
