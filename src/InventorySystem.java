import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

class InventorySystem {
    private HashMap<Integer, Product> inventory;
    private List<List<Integer>> dailyShipments;

    public InventorySystem() {
        inventory = new HashMap<>();
        dailyShipments = new ArrayList<>();
    }

    public void addProduct(int id, String name, int quantity) {
        if (inventory.containsKey(id)) {
            System.out.println("Product with ID " + id + " already exists.");
        } else {
            inventory.put(id, new Product(id, name, quantity));
            System.out.println("Product added: " + name);
        }
    }

    public void lookUpProductById(int id) {
        if (inventory.containsKey(id)) {
            System.out.println(inventory.get(id));
        } else {
            System.out.println("Product with ID " + id + " not found.");
        }
    }

    public void printSortedProductsByName() {
        List<Product> productList = new ArrayList<>(inventory.values());
        productList.sort(Comparator.comparing(Product::getName));
        System.out.println("Products sorted by name:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void recordDailyShipment(List<Integer> shipment) {
        dailyShipments.add(shipment);
        System.out.println("Daily shipment recorded.");
    }

    public void printDailyShipment(int dayIndex) {
        if (dayIndex < 0 || dayIndex >= dailyShipments.size()) {
            System.out.println("Invalid day index.");
            return;
        }

        List<Integer> shipment = dailyShipments.get(dayIndex);
        System.out.println("Shipment for Day " + (dayIndex + 1) + ": " + shipment);
    }
}
