package VendingMachine;

public class Product {
    private int code;
    private String name;
    private double price;

    private int quantity;

    public Product(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
        quantity = 0;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void addProduct(int quantity) {
        this.quantity += quantity;
    }

    private boolean removeProduct() {
        if (quantity <= 0) {
            System.out.println("Product: " + name + " out of stock");
            return false;
        }
        quantity--;
        return true;
    }
}
