import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========== Create new HashMap object");
        Map<String, Double> inventory = new HashMap<>();

        inventory.put("Bananas", 2.99);
        inventory.put("Papaya", 5.99);
        inventory.put("Kale", 4.99);
        inventory.put("Apple", 1.99);

        System.out.println("\nWhat is the price of Bananas");
        System.out.println(inventory.get("Bananas"));

        System.out.println("\nWhat is the price of Kale");
        System.out.println(inventory.get("Kale"));

        System.out.println("\nDo you guys sell apple?");
        boolean isApple = inventory.containsKey("Apple");
        String result = isApple ? "Yes!" : "No"; 
        System.out.println(result);

        System.out.println(inventory.values());

        
    }
}
