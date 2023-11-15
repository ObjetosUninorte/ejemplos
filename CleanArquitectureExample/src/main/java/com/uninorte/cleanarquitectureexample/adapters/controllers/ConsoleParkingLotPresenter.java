package com.uninorte.cleanarquitectureexample.adapters.controllers;

import com.uninorte.cleanarquitectureexample.core.entities.ParkingLot;

public class ConsoleParkingLotPresenter implements ParkingLotPresenter {
    private final ParkingLot parkingLot;

    public ConsoleParkingLotPresenter(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public void presentParkingLotStatus() {
        System.out.println("Parking Lot Status:");
        parkingLot.getCars().forEach(car -> System.out.println("License Plate: " + car.getLicensePlate()));
        System.out.println("Total Cars: " + parkingLot.getCars().size());
        System.out.println();
    }
}
