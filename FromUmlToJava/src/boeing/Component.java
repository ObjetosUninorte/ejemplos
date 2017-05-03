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
public class Component {
    
    private ArrayList<Component> assembly;
    private ArrayList<Component> subAssembly;
    private Airplane airplane;

    public Component(Airplane airplane) {
        this.airplane = airplane;
        subAssembly = new ArrayList<>();
        buildSubComponents();
        assembly = new ArrayList<>();
    }
    
    private void buildSubComponents(){
        Component subx = new Component(airplane);
        Component suby = new Component(airplane);
        subAssembly.add(subx);
        subAssembly.add(suby);
    }
    
    public void addAssembly(Component component){
        assembly.add(component);
    }
    

    
    
}
