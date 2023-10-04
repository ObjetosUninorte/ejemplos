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
public class Appoiment extends Identification{
    private Doctor doctor;
    private Patient patient;
    private Prescription prescription;

    public Appoiment(int id,Doctor doctor,Patient patient) {
        super(id);
        this.doctor = doctor;
        doctor.agregarAppoiment(this);
        this.patient = patient;
        patient.agregarAppoiment(this);
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    
    
}
