interface Vehicle {
    void start();
    void stop();
}
 
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
 
    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }
}
 
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }
 
    @Override
    public void stop() {
        System.out.println("Bike has stopped.");
    }
}
 
public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
 
        car.start();
        car.stop();
 
        bike.start();
        bike.stop();
    }
}
