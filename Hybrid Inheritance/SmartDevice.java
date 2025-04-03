class Device {
    String brand;
    
    Device(String brand) {
        this.brand = brand;
    }
    
    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}
 
interface CallingFeature {
    void makeCall(String number);
}
 
interface LargeScreenFeature {
    void watchMovie(String movie);
}
 
class Smartphone extends Device implements CallingFeature {
    Smartphone(String brand) {
        super(brand);
    }
    
    public void makeCall(String number) {
        System.out.println("Calling " + number + " from a smartphone.");
    }
}
 
class Tablet extends Device implements LargeScreenFeature {
    Tablet(String brand) {
        super(brand);
    }
    
    public void watchMovie(String movie) {
        System.out.println("Watching " + movie + " on a large screen tablet.");
    }
}
 
class SmartTabletPhone extends Smartphone implements LargeScreenFeature {
    SmartTabletPhone(String brand) {
        super(brand);
    }
    
    public void watchMovie(String movie) {
        System.out.println("Watching " + movie + " on a SmartTabletPhone.");
    }
}
 
public class SmartDevice {
    public static void main(String[] args) {
        SmartTabletPhone hybridDevice = new SmartTabletPhone("TechBrand");
 
        hybridDevice.showBrand();
        hybridDevice.makeCall("123-456-7890");
        hybridDevice.watchMovie("Inception");
    }
}
