class Vehicle {
    public void maxSpeed() {
        System.out.println("Vehicle has a standard speed.");
    }
}
 
class Car extends Vehicle {
    @Override
    public void maxSpeed() {
        System.out.println("Car max speed: 200 km/h");
    }
}
 
class Bike extends Vehicle {
    @Override
    public void maxSpeed() {
        System.out.println("Bike max speed: 120 km/h");
    }
}
 
public class VehicleSpeed {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();
        Vehicle v3 = new Bike();
 
        v1.maxSpeed();
        v2.maxSpeed();
        v3.maxSpeed();
    }
}
