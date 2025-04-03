interface Order {
    void placeOrder(String item, int quantity);
}
 
class DineInOrder implements Order {
    @Override
    public void placeOrder(String item, int quantity) {
        System.out.println("Dine-in Order Placed: " + quantity + " x " + item);
    }
}
 
class TakeawayOrder implements Order {
    @Override
    public void placeOrder(String item, int quantity) {
        System.out.println("Takeaway Order Placed: " + quantity + " x " + item);
    }
}
 
public class RestaurantOrder {
    public static void main(String[] args) {
        Order dineIn = new DineInOrder();
        Order takeaway = new TakeawayOrder();
 
        dineIn.placeOrder("Pizza", 2);
        takeaway.placeOrder("Burger", 1);
    }
}
