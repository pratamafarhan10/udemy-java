import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new LinkedList<>();

        System.out.println("=========== Add");
        System.out.println("Array size: " + cities.size() + "\n");
        cities.add("Bandung");
        cities.add("Jakarta");
        cities.add("Tangerang");
        cities.add("Semarang");
        cities.add("Surabaya");
        cities.add("Garut");
        cities.add("Magelang");
        cities.add("Malang");
        cities.add("Jember");
        cities.add("Madura");
        cities.add("Yogyakarta");
        System.out.println(Arrays.toString(cities.toArray()) + "\n");
        
        System.out.println("=========== Add at index of i");
        cities.add(2, "Bali");
        System.out.println(Arrays.toString(cities.toArray()) + "\n");
        
        System.out.println("=========== Contains");
        System.out.println(cities.contains("Bali"));

        System.out.println("=========== Remove specific element at index of i");
        String bali = cities.remove(2);
        System.out.println(bali);
        System.out.println(Arrays.toString(cities.toArray()) + "\n");

        System.out.println("=========== Remove specific element that equals to");
        cities.remove("Malang");
        System.out.println(Arrays.toString(cities.toArray()) + "\n");
        
        System.out.println("=========== Set specific element at index of i");
        cities.set(cities.size()-1, "PADANG");
        System.out.println(Arrays.toString(cities.toArray()) + "\n");

        System.out.println("=========== Push");
    }
}
