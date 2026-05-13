import java.util.HashMap;
import java.util.Map;

public class InventorySystem {

    public static void main(String[] args) {

        HashMap<String, Integer> inventory =
                new HashMap<>();

        // Adding products
        inventory.put("Laptop", 10);
        inventory.put("Mouse", 25);
        inventory.put("Keyboard", 15);
        inventory.put("Monitor", 8);

        System.out.println("Inventory Details:\n");

        // Display inventory
        for (Map.Entry<String, Integer> item
                : inventory.entrySet()) {

            System.out.println(
                    "Product: " + item.getKey()
                    + " | Quantity: "
                    + item.getValue());
        }

        // Updating quantity
        inventory.put("Mouse", 30);

        System.out.println("\nUpdated Inventory:\n");

        for (Map.Entry<String, Integer> item
                : inventory.entrySet()) {

            System.out.println(
                    item.getKey()
                    + " -> "
                    + item.getValue());
        }
    }
}