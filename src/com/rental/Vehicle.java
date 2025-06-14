package com.rental;

public abstract class Vehicle {
    protected String vehicleID;
    protected String modelName;
    protected double rentalRate;
    protected boolean isRented;

    public Vehicle(String vehicleID, String modelName, double rentalRate) {
        this.vehicleID = vehicleID;
        this.modelName = modelName;
        this.rentalRate = rentalRate;
        this.isRented = false;
    }

    public abstract double calculateRentalCost(int days);

    public String getVehicleID() {
        return vehicleID;
    }

    public boolean isRented() {
        return isRented;
    }

    @Override
    public String toString() {
        return modelName + " (" + vehicleID + ")";
    }
}

