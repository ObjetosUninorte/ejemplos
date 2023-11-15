package com.uninorte.cleanarquitectureexample.core.usecases;

import com.uninorte.cleanarquitectureexample.core.entities.Car;
import com.uninorte.cleanarquitectureexample.core.entities.ParkingLot;

public class ParkCarUseCase {
    private final ParkingLot parkingLot;

    public ParkCarUseCase(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void execute(String licensePlate) {
        Car car = new Car(licensePlate);
        parkingLot.parkCar(car);
    }
}