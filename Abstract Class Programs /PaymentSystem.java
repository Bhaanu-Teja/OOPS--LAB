abstract class Payment {
    abstract void processPayment(double amount);
}
 
class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed using Credit Card.");
    }
}
 
class PayPalPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed using PayPal.");
    }
}
 
public class PaymentSystem {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment payPal = new PayPalPayment();
 
        creditCard.processPayment(100);
        payPal.processPayment(50);
    }
}
