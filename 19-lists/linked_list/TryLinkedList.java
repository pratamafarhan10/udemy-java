import java.util.Arrays;
import java.util.LinkedList;

public class TryLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.push("Bali");
        list.push("Jakarta");

        System.out.println(Arrays.toString(list.toArray()));
    }    
}
