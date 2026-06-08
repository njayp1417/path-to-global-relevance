import java.util.HashMap;
import java.util.ArrayList;


public class InventorySystem {
    static ArrayList<String> products = new ArrayList<>();
    static HashMap<String, Double> prices = new HashMap<>();

    static void addProduct(String name, double price) {
        products.add(name);
        prices.put(name, price);

        System.out.println(name + " added to Inventory.");

    }
    static void removeProduct(String name) {
        products.remove(name);
        prices.remove(name);
        System.out.println(name + " removed from Inventory.");


    }
    static void displayInventory() {
        System.out.println("---Invemtory---");
        for(String product : products) {
            System.out.println(product + " - $" + prices.get(product));
        }
        


    }

    public static void main(String[] args) {
        addProduct("Laptop", 999.99);
        addProduct("Smartphone", 499.99);
        addProduct("Headphones", 199.99);

        displayInventory();

        removeProduct("Smartphone");

        displayInventory();
    }
}
