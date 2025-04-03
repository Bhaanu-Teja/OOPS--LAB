class Product {
    private String productName;
    private int stock;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Stock cannot be negative!");
        }
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product p = new Product();
        p.setProductName("Laptop");
        p.setStock(10);

        System.out.println("Product: " + p.getProductName());
        System.out.println("Stock Available: " + p.getStock());
    }
}
