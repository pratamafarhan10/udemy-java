import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] spareparts = new String[]{"Tires", "Keys"};

        Car toyota = new Car("Toyota", 10000, 2020, "Green", spareparts);
        // Car nissan = new Car("Nissan", 11000, 2019, "Blue", spareparts);

        // System.out.println(toyota.toString());
        System.out.println(toyota);
    }
}
