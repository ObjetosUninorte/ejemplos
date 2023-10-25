/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.uninorte.citasmedicas.CitasMedicas;
import com.uninorte.citasmedicas.Doctor;
import com.uninorte.citasmedicas.Paciente;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author augustosalazar
 */
public class CitasTest {
    
    @Test
    @DisplayName("testDoctorCount")
    public void testDoctorCount() {
        
        CitasMedicas citasMedicas = new CitasMedicas();

        for (int i = 0; i < 3; i++) {
            citasMedicas.agregarDoctor(new Doctor(i));
        }
        
        Assertions.assertEquals(3, citasMedicas.getDoctorCount());
    }
    
    @Test
    @DisplayName("testGetDoctor")
    public void testGetDoctor() {
        
        CitasMedicas citasMedicas = new CitasMedicas();

        citasMedicas.agregarDoctor(new Doctor(2));
        
        Assertions.assertNull(citasMedicas.buscarDoctor(1));
        Assertions.assertNotNull(citasMedicas.buscarDoctor(2));
    }
   
    @Test
    @DisplayName("testPatientCount")
    public void testPatientCount() {
        
        CitasMedicas citasMedicas = new CitasMedicas();

        for (int i = 0; i < 10; i++) {
            citasMedicas.agregarPaciente(new Paciente(i));
        }
        
        Assertions.assertEquals(10, citasMedicas.getPatientCount());
    }

    @Test
    @DisplayName("TestCitas")
    public void testCitas(){

        CitasMedicas citasMedicas = new CitasMedicas();

        citasMedicas.agregarDoctor(new Doctor(1));
        citasMedicas.agregarDoctor(new Doctor(2));
        citasMedicas.agregarPaciente(new Paciente(10));
        citasMedicas.agregarPaciente(new Paciente(11));
        citasMedicas.agregarPaciente(new Paciente(12));
        citasMedicas.agregarPaciente(new Paciente(13));

        citasMedicas.agregarCita(10, 1);
        citasMedicas.agregarCita(11, 2);
        citasMedicas.agregarCita(11, 2);
        citasMedicas.agregarCita(12,2);
        citasMedicas.agregarCita(13, 2);

        Assertions.assertEquals(1, citasMedicas.getCitasCountDoctor(1));
        Assertions.assertEquals(4, citasMedicas.getCitasCountDoctor(2));

        Assertions.assertEquals(1, citasMedicas.getCitasCountPatient(10));
        Assertions.assertEquals(2, citasMedicas.getCitasCountPatient(11));
        
    }
    
}
