/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uninorte.mvclinearexample;

/**
 *
 * @author augustosalazar
 */
public interface ParkingLotObserver {
     void update(ParkingLot parkingLot);

    void parkCar(String licensePlate);

    void removeCar(String licensePlate);
}
