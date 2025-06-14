package com.rental;

public class Car extends Vehicle implements Rentable {
    public Car(String vehicleID, String modelName, double rentalRate) {
        super(vehicleID, modelName, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
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

