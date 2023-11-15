/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uninorte.mvclinearexample;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotController {
    private ParkingLot parkingLot;
    private List<ParkingLotObserver> observers;

    public ParkingLotController() {
        this.parkingLot = new ParkingLot();
        this.observers = new ArrayList<>();
    }

    public void addObserver(ParkingLotObserver observer) {
        observers.add(observer);
    }

    public void parkCar(String licensePlate) {
        Car car = new Car(licensePlate);
        parkingLot.parkCar(car);
        notifyObserversParkCar(licensePlate);
        notifyObservers();
    }

    public void removeCar(String licensePlate) {
        Car carToRemove = parkingLot.getCars().stream()
                .filter(car -> car.getLicensePlate().equals(licensePlate))
                .findFirst()
                .orElse(null);

        if (carToRemove != null) {
            parkingLot.removeCar(carToRemove);
            notifyObserversRemoveCar(licensePlate);
            notifyObservers();
        } else {
            System.out.println("Car with license plate " + licensePlate + " not found in the parking lot.");
        }
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void printParkingLotStatus() {
        for (ParkingLotObserver observer : observers) {
            observer.update(parkingLot);
        }
    }

    private void notifyObservers() {
        for (ParkingLotObserver observer : observers) {
            observer.update(parkingLot);
        }
    }

    private void notifyObserversParkCar(String licensePlate) {
        for (ParkingLotObserver observer : observers) {
            observer.parkCar(licensePlate);
        }
    }

    private void notifyObserversRemoveCar(String licensePlate) {
        for (ParkingLotObserver observer : observers) {
            observer.removeCar(licensePlate);
        }
    }
}