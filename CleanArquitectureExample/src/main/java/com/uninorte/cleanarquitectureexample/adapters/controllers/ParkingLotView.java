package com.uninorte.cleanarquitectureexample.adapters.controllers;

import java.util.Scanner;

public class ParkingLotView {
    private final ParkingLotController parkingLotController;
    private final Scanner scanner;

    public ParkingLotView(ParkingLotController parkingLotController) {
        this.parkingLotController = parkingLotController;
        this.scanner = new Scanner(System.in);
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
                    parkingLotController.parkCar(licensePlateToPark);
                    break;
                case 2:
                    String licensePlateToRemove = promptForLicensePlate();
                    parkingLotController.removeCar(licensePlateToRemove);
                    break;
                case 3:
                    parkingLotController.parkCar(""); // Dummy parameter, just to trigger status presentation
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private String promptForLicensePlate() {
        System.out.print("Enter license plate: ");
        return scanner.nextLine();
    }
}
