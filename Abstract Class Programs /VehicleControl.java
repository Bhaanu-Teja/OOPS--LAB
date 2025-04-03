abstract class Vehicle {
    abstract void start();
    abstract void stop();
}
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting...");
    }
    @Override
    void stop() {
        System.out.println("Car has stopped.");
    }
}
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting...");
    }
    @Override
    void stop() {
        System.out.println("Bike has stopped.");
    }
}
public class VehicleControl {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }
}
