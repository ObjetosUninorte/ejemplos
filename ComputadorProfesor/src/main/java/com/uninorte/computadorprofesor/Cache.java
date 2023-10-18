package com.uninorte.computadorprofesor;

public class Cache implements Memory {

    @Override
    public void write(int address) {
        System.out.println("Writing to cache");
    }

    @Override
    public Byte read(int address) {
        System.out.println("Reading from cache");
        return 0;
    }
    
}
