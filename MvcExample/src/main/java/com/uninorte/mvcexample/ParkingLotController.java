/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uninorte.mvcexample;

public class ParkingLotController {
    private ParkingLot parkingLot;
    private ParkingLotView parkingLotView;

    public ParkingLotController(ParkingLot parkingLot, ParkingLotView parkingLotView) {
        this.parkingLot = parkingLot;
        this.parkingLotView = parkingLotView;
    }

    public void parkCar(String licensePlate) {
        Car car = new Car(licensePlate);
        parkingLot.parkCar(car);
        parkingLotView.printParkingLotStatus(parkingLot);
    }

    public void removeCar(String licensePlate) {
        Car carToRemove = parkingLot.getCars().stream()
                .filter(car -> car.getLicensePlate().equals(licensePlate))
                .findFirst()
                .orElse(null);

        if (carToRemove != null) {
            parkingLot.removeCar(carToRemove);
            parkingLotView.printParkingLotStatus(parkingLot);
        } else {
            System.out.println("Car with license plate " + licensePlate + " not found in the parking lot.");
        }
    }
}