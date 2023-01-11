import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> tree = new TreeMap<>();
        int multiplier = 5;
        tree.put(1, multiplier * 1);
        tree.put(2, multiplier * 2);
        tree.put(3, multiplier * 3);
        tree.put(4, multiplier * 4);
        tree.put(5, multiplier * 5);

        System.out.println("\nWhat is 4 multiplied by " + multiplier);
        System.out.println(tree.get(4));

        System.out.println("\nDoes the tree contains key 20?");
        System.out.println((tree.containsKey(20) ? "Yes" : "No"));

        System.out.println("\n" + tree.values());
    }
}
