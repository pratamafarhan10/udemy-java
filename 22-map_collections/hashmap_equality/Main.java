import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("Alice", 30);
        Contact contactCopy = new Contact(contact);

        System.out.println("========== HashCode ==========");
        System.out.println("First hashcode: "+ contact.hashCode());
        System.out.println("Second hashcode: "+ contactCopy.hashCode());

        System.out.println("========== HashCode ==========");
        System.out.println("Equality: " + contact.equals(contactCopy));

        Map<Contact, String> peopleMap = new HashMap<>();

        peopleMap.put(new Contact("Alice", 20), "Jl. Jakarta");
        peopleMap.put(new Contact("John", 53), "Jl. Bandung");
        peopleMap.put(new Contact("Doe", 43), "Jl. Semarang");
        peopleMap.put(new Contact("Marcus", 12), "Jl. Garut");

        System.out.println("========== Does map contains ==========");
        System.out.println(peopleMap.containsKey(new Contact("Alice", 20)));
        System.out.println("Alice address is: " + peopleMap.get(new Contact("Alice", 20)) );
    }
}
