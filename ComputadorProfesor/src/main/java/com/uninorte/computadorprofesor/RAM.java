package com.uninorte.computadorprofesor;

public class RAM implements Memory {

    @Override
    public void write(int address) {
        System.out.println("Writing to RAM");
    }

    @Override
    public Byte read(int address) {
        System.out.println("Reading from RAM");
        return 0;
    }
    
}
