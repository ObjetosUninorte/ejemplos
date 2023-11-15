/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uninorte.mvclinearexample;

/**
 *
 * @author augustosalazar
 */
public class MVCLinearExample {

    public static void main(String[] args) {
        ParkingLotController parkingLotController = new ParkingLotController();

        ParkingLotView parkingLotView = new ParkingLotView(parkingLotController);
        parkingLotController.addObserver(parkingLotView);

        parkingLotView.start();
    }
}
