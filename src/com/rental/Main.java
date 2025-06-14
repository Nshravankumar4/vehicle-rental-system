package com.rental;

public class Main {
    public static void main(String[] args) {
        RentalService service = new RentalService();

        service.addVehicle(new Car("C101", "Toyota Camry", 60));
        service.addVehicle(new Bike("B202", "Yamaha R15", 20));
        service.addVehicle(new Truck("T303", "Volvo Truck", 100));

        service.listAvailableVehicles();

        service.rentVehicle("C101", 3);
        service.rentVehicle("B202", 2);
        service.returnVehicle("B202");

        service.listAvailableVehicles();
    }
}

