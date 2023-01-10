import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] spareparts = new String[]{"Tires", "Keys"};

        Car toyota = new Car("Toyota", 10000, 2020, "Green", spareparts);
        // Car nissan = new Car("Nissan", 11000, 2019, "Blue", spareparts);

       System.out.println("========= Toyota getters without copying new array: before changing one element in array");
       System.out.println("\t" + toyota.getBrand());
       System.out.println("\t" + toyota.getPrice());
       System.out.println("\t" + toyota.getYear());
       System.out.println("\t" + toyota.getColor());
       System.out.println("\t" + Arrays.toString(toyota.getParts()));

       String[] parts = toyota.getParts();
       parts[0] = "Engine";

       System.out.println("========= Toyota getters without copying new array: after changing one element in array");
       System.out.println("\t" + toyota.getBrand());
       System.out.println("\t" + toyota.getPrice());
       System.out.println("\t" + toyota.getYear());
       System.out.println("\t" + toyota.getColor());
       System.out.println("\t" + Arrays.toString(toyota.getParts()));
    }
}
