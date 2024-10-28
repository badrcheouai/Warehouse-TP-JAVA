import java.util.Arrays;
import java.util.List;

public class WarehouseInventory {
    public static void main(String[] args) {
        InventorySystem inventory = new InventorySystem();

        // Adding products
        inventory.addProduct(101, "Laptop", 10);
        inventory.addProduct(102, "Mouse", 50);
        inventory.addProduct(103, "Keyboard", 30);

        // Looking up a product
        inventory.lookUpProductById(102);

        // Sorting products by name
        inventory.printSortedProductsByName();

        // Recording a daily shipment
        List<Integer> shipment1 = Arrays.asList(101, 103, 102);
        inventory.recordDailyShipment(shipment1);

        // Print shipment details
        inventory.printDailyShipment(0);
    }
}