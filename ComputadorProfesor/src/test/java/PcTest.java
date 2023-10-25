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
import com.uninorte.computadorprofesor.DeviceCard;
import com.uninorte.computadorprofesor.ExtensionCard;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author augustosalazar
 */
public class PcTest {

    @Test
    @DisplayName("testChildrenCount")
    public void testChildrenCount() {
        ComputadorProfesor machine = new ComputadorProfesor(new AcceleratorCard(), new Cache());
        machine.addDeviceCard(0);
        Assertions.assertEquals(1, machine.getDeviceCardCount());
    }

    @Test
    @DisplayName("Children validation test")
    public void testChildrenValidation() {
        ComputadorProfesor machine = new ComputadorProfesor(new AcceleratorCard(), new Cache());
        machine.addDeviceCard(0);
        machine.addExtensionCard(1);
        machine.addExtensionCard(2);
        machine.addDeviceCard(3);//should fail
        Assertions.assertEquals(3, machine.getTotalCardCount());
    }

    @Test
    @DisplayName("Children validation child in device card")
    public void testValidationChildOnDeviceCard() {
        ComputadorProfesor machine = new ComputadorProfesor(new AcceleratorCard(), new Cache());
        machine.addDeviceCard(0);
        machine.addCard2ExtensionCard(machine.getCardById(0), new DeviceCard(1));
        Assertions.assertEquals(1, machine.getTotalCardCount());
    }

    @Test
    @DisplayName("Children validation child in extension card")
    public void testValidationChildOnExtensionCard() {
        ComputadorProfesor machine = new ComputadorProfesor(new AcceleratorCard(), new Cache());
        machine.addExtensionCard(0);
        machine.addCard2ExtensionCard(machine.getCardById(0), new DeviceCard(1));
        Assertions.assertEquals(2, machine.getTotalCardCount());
        Assertions.assertEquals(1, machine.getExtentionCardCount());
        Assertions.assertEquals(1, machine.getDeviceCardCount());
    }
    
    @Test
    @DisplayName("Nested children validation")
    public void testNestedChildren() {
        ComputadorProfesor machine = new ComputadorProfesor(new AcceleratorCard(), new Cache());
        machine.addExtensionCard(0);
        machine.addCard2ExtensionCard(machine.getCardById(0), new ExtensionCard(1));
        machine.addCard2ExtensionCard(machine.getCardById(1), new DeviceCard(2));
        
        
        Assertions.assertEquals(3, machine.getTotalCardCount());
        Assertions.assertEquals(2, machine.getExtentionCardCount());
        Assertions.assertEquals(1, machine.getDeviceCardCount());
    }
}
