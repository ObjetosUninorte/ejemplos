/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uninorte.mvclinearexample;

import java.util.Scanner;

public class ParkingLotView implements ParkingLotObserver {
    private Scanner scanner;
    private ParkingLotController parkingLotController;

    public ParkingLotView(ParkingLotController parkingLotController) {
        this.parkingLotController = parkingLotController;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void update(ParkingLot parkingLot) {
        printParkingLotStatus(parkingLot);
    }

    @Override
    public void parkCar(String licensePlate) {
        parkingLotController.parkCar(licensePlate);
    }

    @Override
    public void removeCar(String licensePlate) {
        parkingLotController.removeCar(licensePlate);
    }

    public void printParkingLotStatus(ParkingLot parkingLot) {
        System.out.println("Parking Lot Status:");
        parkingLotController.printParkingLotStatus();
    }

    public String promptForLicensePlate() {
        System.out.print("Enter license plate: ");
        return scanner.nextLine();
    }

    public void start() {
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Park Car");
            System.out.println("2. Remove Car");
            System.out.println("3. Print Parking Lot Status");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    String licensePlateToPark = promptForLicensePlate();
                    parkCar(licensePlateToPark);
                    break;
                case 2:
                    String licensePlateToRemove = promptForLicensePlate();
                    removeCar(licensePlateToRemove);
                    break;
                case 3:
                    printParkingLotStatus(parkingLotController.getParkingLot());
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}