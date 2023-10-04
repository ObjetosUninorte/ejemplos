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
public class Ward extends Identification{
    
    private ArrayList<Patient> patients = new ArrayList<>();
    
    public Ward(int id) {
        super(id);
    }
    
    public void agregarPaciente(Patient p){
        patients.add(p);
    }

    public Patient getPatient(int id) {
       for (Patient p : patients) {
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }
    
}
