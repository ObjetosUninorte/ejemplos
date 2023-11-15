/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uninorte.mvcexample;

/**
 *
 * @author augustosalazar
 */
public class MvcExample {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        ParkingLotView parkingLotView = new ParkingLotView();
        ParkingLotController parkingLotController = new ParkingLotController(parkingLot, parkingLotView);

        // Park cars
        parkingLotController.parkCar("ABC123");
        parkingLotController.parkCar("XYZ789");

        // Remove a car
        parkingLotController.removeCar("ABC123");

        // Park another car
        parkingLotController.parkCar("DEF456");
    }
}
