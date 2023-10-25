/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.uninorte.computadorprofesor.AcceleratorCard;
import com.uninorte.computadorprofesor.Cache;
import com.uninorte.computadorprofesor.ComputadorProfesor;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author augustosalazar
 */
public class PcTest {
    
    public PcTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testChildrenCount() {
        ComputadorProfesor machine = new ComputadorProfesor(new AcceleratorCard(), new Cache());
        machine.addDeviceCard(0);
        Assertions.assertEquals(1, machine.getCardCount());
    }
}
