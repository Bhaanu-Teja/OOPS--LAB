import java.util.ArrayList;
 
class Product {
    private String name;
    private double price;
    private int quantity;
 
 
    public Product() {
        this.name = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
    }
 
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1; // Default quantity
    }
 
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
 
    public double getTotalPrice() {
        return price * quantity;
    }
 
    public void displayProduct() {
        System.out.println(name + " - $" + price + " x " + quantity + " = $" + getTotalPrice());
    }
}
 
class Order {
    private int orderId;
    private ArrayList<Product> products;
    private double totalAmount;
 
    public Order() {
        this.orderId = 0;
        this.products = new ArrayList<>();
        this.totalAmount = 0.0;
    }
 
    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
        this.totalAmount = 0.0;
    }
 
    public Order(int orderId, ArrayList<Product> products) {
        this.orderId = orderId;
        this.products = products;
        calculateTotal();
    }
 
    private void calculateTotal() {
        totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getTotalPrice();
        }
    }
 
    public void addProduct(Product product) {
        products.add(product);
        calculateTotal();
    }
 
    public void displayOrder() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Products:");
        for (Product product : products) {
            product.displayProduct();
        }
        System.out.println("Total Amount: $" + totalAmount);
    }
 
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Laptop", 1200);
        Product p3 = new Product("Headphones", 100, 2);
        Product p4 = new Product("Mouse", 50, 1);
 
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(p2);
        productList.add(p3);
 
        Order order1 = new Order();
        Order order2 = new Order(101);
        Order order3 = new Order(102, productList);
 
        order2.addProduct(p4);
        order2.addProduct(p3);
 
        order1.displayOrder();
        order2.displayOrder();
        order3.displayOrder();
    }
}
