class SmartDevice {
    String deviceName;
    boolean powerStatus;
 
    SmartDevice(String name) {
        this.deviceName = name;
        this.powerStatus = false; // Initially off
    }
 
    void turnOn() {
        powerStatus = true;
        System.out.println(deviceName + " is now ON.");
    }
 
    void turnOff() {
        powerStatus = false;
        System.out.println(deviceName + " is now OFF.");
    }
}
 
class SmartLight extends SmartDevice {
    int brightness;
    String color;
 
    SmartLight(String name, int brightness, String color) {
        super(name);
        this.brightness = brightness;
        this.color = color;
    }
 
    void setBrightness(int level) {
        this.brightness = level;
        System.out.println(deviceName + " brightness set to " + level + "%.");
    }
 
    void setColor(String newColor) {
        this.color = newColor;
        System.out.println(deviceName + " color changed to " + newColor + ".");
    }
 
    void displayStatus() {
        System.out.println(deviceName + " Status: Power=" + (powerStatus ? "ON" : "OFF") + 
                           ", Brightness=" + brightness + "%, Color=" + color);
    }
}
public class SmartHome {
    public static void main(String[] args) {
        SmartLight light = new SmartLight("Living Room Light", 70, "White");
        light.turnOn();
        light.setBrightness(90);
        light.setColor("Blue");
        light.displayStatus();
        light.turnOff();
    }
}
