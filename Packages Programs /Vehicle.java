package mypackage.vehicle;

public class Vehicle {
    private String model;
    private String brand;
    
    public Vehicle(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public void displayVehicle() {
        System.out.println("Vehicle Model: " + model);
        System.out.println("Brand: " + brand);
    }
}

import mypackage.vehicle.Vehicle;

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Model S", "Tesla");
        car.displayVehicle();
    }
}
