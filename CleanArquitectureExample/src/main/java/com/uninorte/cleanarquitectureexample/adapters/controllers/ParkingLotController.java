package com.uninorte.cleanarquitectureexample.adapters.controllers;

import com.uninorte.cleanarquitectureexample.core.usecases.ParkCarUseCase;
import com.uninorte.cleanarquitectureexample.core.usecases.RemoveCarUseCase;

public class ParkingLotController {
    private final ParkCarUseCase parkCarUseCase;
    private final RemoveCarUseCase removeCarUseCase;
    private final ParkingLotPresenter presenter;

    public ParkingLotController(ParkCarUseCase parkCarUseCase, RemoveCarUseCase removeCarUseCase, ParkingLotPresenter presenter) {
        this.parkCarUseCase = parkCarUseCase;
        this.removeCarUseCase = removeCarUseCase;
        this.presenter = presenter;
    }

    public void parkCar(String licensePlate) {
        parkCarUseCase.execute(licensePlate);
        presenter.presentParkingLotStatus();
    }

    public void removeCar(String licensePlate) {
        removeCarUseCase.execute(licensePlate);
        presenter.presentParkingLotStatus();
    }
}
