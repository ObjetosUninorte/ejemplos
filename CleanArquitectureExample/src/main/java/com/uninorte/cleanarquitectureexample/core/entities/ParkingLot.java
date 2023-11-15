package com.uninorte.cleanarquitectureexample.core.entities;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Car> cars;

    public ParkingLot() {
        this.cars = new ArrayList<>();
    }

    public void parkCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> getCars() {
        return cars;
    }
}