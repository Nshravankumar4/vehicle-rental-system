package com.rental;

import java.util.HashMap;
import java.util.Map;

public class RentalService {
    private Map<String, Vehicle> vehicleMap = new HashMap<>();

    public void addVehicle(Vehicle vehicle) {
        vehicleMap.put(vehicle.getVehicleID(), vehicle);
    }

    public boolean rentVehicle(String vehicleID, int days) {
        Vehicle vehicle = vehicleMap.get(vehicleID);
        if (vehicle instanceof Rentable && !vehicle.isRented()) {
            ((Rentable) vehicle).rentVehicle();
            System.out.println("Rented " + vehicle + " for " + days + " days. Total: $" + vehicle.calculateRentalCost(days));
            return true;
        }
        System.out.println("Vehicle " + vehicleID + " is not available.");
        return false;
    }

    public boolean returnVehicle(String vehicleID) {
        Vehicle vehicle = vehicleMap.get(vehicleID);
        if (vehicle instanceof Rentable && vehicle.isRented()) {
            ((Rentable) vehicle).returnVehicle();
            System.out.println("Returned " + vehicle);
            return true;
        }
        System.out.println("Vehicle " + vehicleID + " was not rented.");
        return false;
    }

    public void listAvailableVehicles() {
        System.out.println("Available Vehicles:");
        for (Vehicle v : vehicleMap.values()) {
            if (!v.isRented()) {
                System.out.println(v);
            }
        }
    }
}

