/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uninorte.mvcexample;

public class ParkingLotView {
    
    public void printParkingLotStatus(ParkingLot parkingLot) {
        System.out.println("Parking Lot Status:");
        for (Car car : parkingLot.getCars()) {
            System.out.println("License Plate: " + car.getLicensePlate());
        }
        System.out.println("Total Cars: " + parkingLot.getCars().size());
        System.out.println();
    }
}