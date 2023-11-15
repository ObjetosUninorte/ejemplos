package com.uninorte.cleanarquitectureexample.core.usecases;

import com.uninorte.cleanarquitectureexample.core.entities.Car;
import com.uninorte.cleanarquitectureexample.core.entities.ParkingLot;

public class RemoveCarUseCase {
    private final ParkingLot parkingLot;

    public RemoveCarUseCase(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void execute(String licensePlate) {
        Car carToRemove = parkingLot.getCars().stream()
                .filter(car -> car.getLicensePlate().equals(licensePlate))
                .findFirst()
                .orElse(null);

        if (carToRemove != null) {
            parkingLot.removeCar(carToRemove);
        } else {
            throw new RuntimeException("Car not found in the parking lot.");
        }
    }
}