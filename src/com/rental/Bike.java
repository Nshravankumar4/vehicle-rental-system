package com.rental;

public class Bike extends Vehicle implements Rentable {
    public Bike(String vehicleID, String modelName, double rentalRate) {
        super(vehicleID, modelName, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 0.9; // 10% discount
    }

    @Override
    public boolean rentVehicle() {
        if (!isRented) {
            isRented = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean returnVehicle() {
        if (isRented) {
            isRented = false;
            return true;
        }
        return false;
    }
}

