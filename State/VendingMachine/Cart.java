package VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final Map<String, Integer> items = new HashMap<>();

    public void addItem(String item) {
        items.put(item, items.getOrDefault(item, 0) + 1);
    }

    public Map<String, Integer> getItems() {
        return items;
    }

    public void clear() {
        items.clear();
    }
}
