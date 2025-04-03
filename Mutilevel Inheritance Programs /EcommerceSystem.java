class Order {
    int orderID;
    
    Order(int orderID) {
        this.orderID = orderID;
    }
    void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
    }
}
class OnlineOrder extends Order {
    String paymentMethod;
    
    OnlineOrder(int orderID, String paymentMethod) {
        super(orderID);
        this.paymentMethod = paymentMethod;
    }
    void processPayment() {
        System.out.println("Payment processed via: " + paymentMethod);
    }
}
 
class PrimeOrder extends OnlineOrder {
    boolean expressDelivery;
    PrimeOrder(int orderID, String paymentMethod, boolean expressDelivery) {
        super(orderID, paymentMethod);
        this.expressDelivery = expressDelivery;
    }
    void checkDelivery() {
        if (expressDelivery) {
            System.out.println("Express delivery is enabled for this order.");
        } else {
            System.out.println("Standard delivery selected.");
        }
    }
}
public class EcommerceSystem {
    public static void main(String[] args) {
        PrimeOrder primeOrder = new PrimeOrder(12345, "Credit Card", true);
        primeOrder.displayOrderDetails();
        primeOrder.processPayment();
        primeOrder.checkDelivery();
    }
}
