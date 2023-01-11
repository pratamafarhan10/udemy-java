import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> link = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            arr.add(i);
            link.add(i);
        }

        System.out.println("=========== Fetching Data At Index of i ===========");
        long start = System.currentTimeMillis();
        arr.get(500000);
        System.out.println("Array List: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        link.get(500000);
        System.out.println("Linked List: " + (System.currentTimeMillis() - start) + "ms");

        System.out.println("=========== Inserting Data At Index of I ===========");
        start = System.currentTimeMillis();
        arr.add(450000, 999);
        System.out.println("Array List: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        link.add(450000, 999);
        System.out.println("Linked List: " + (System.currentTimeMillis() - start) + "ms");
    }
}



