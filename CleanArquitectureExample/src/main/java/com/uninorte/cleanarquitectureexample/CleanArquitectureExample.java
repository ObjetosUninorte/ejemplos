/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uninorte.cleanarquitectureexample;

import com.uninorte.cleanarquitectureexample.adapters.controllers.ConsoleParkingLotPresenter;
import com.uninorte.cleanarquitectureexample.adapters.controllers.ParkingLotController;
import com.uninorte.cleanarquitectureexample.adapters.controllers.ParkingLotView;
import com.uninorte.cleanarquitectureexample.core.entities.ParkingLot;
import com.uninorte.cleanarquitectureexample.core.usecases.ParkCarUseCase;
import com.uninorte.cleanarquitectureexample.core.usecases.RemoveCarUseCase;

/**
 *
 * @author augustosalazar
 */
public class CleanArquitectureExample {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        ConsoleParkingLotPresenter presenter = new ConsoleParkingLotPresenter(parkingLot);
        ParkCarUseCase parkCarUseCase = new ParkCarUseCase(parkingLot);
        RemoveCarUseCase removeCarUseCase = new RemoveCarUseCase(parkingLot);

        ParkingLotController parkingLotController = new ParkingLotController(parkCarUseCase, removeCarUseCase, presenter);
        ParkingLotView parkingLotView = new ParkingLotView(parkingLotController);

        parkingLotController.parkCar("ABC123");
        parkingLotController.parkCar("XYZ789");

        parkingLotView.start();
    }
}
