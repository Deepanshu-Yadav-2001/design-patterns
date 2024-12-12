package VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<String, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getName(), product);
    }

    public Product getProduct(String name) {
        return products.get(name);
    }

    public boolean isAvailable(String name) {
        Product product = products.get(name);
        return product != null && product.getQuantity() > 0;
    }

    public void reduceQuantity(String name) {
        Product product = products.get(name);
        if (product != null && product.getQuantity() > 0) {
            product.setQuantity(product.getQuantity() - 1);
        }
    }
}