package com.uninorte.computadorprofesor;

public class DeviceCard extends Card{

    public DeviceCard(int id) {
        super(id);
        
    }

    public void print(){
         System.out.println("DeviceCard " + getId());
    }
 

}
