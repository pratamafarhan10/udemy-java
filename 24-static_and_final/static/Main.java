public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", 10000, 2020, "Green");
        Car nissan = new Car("Nissan", 11000, 2019, "Blue");

        System.out.println("======== STATIC ========\n");
        System.out.println("======== Calling out from the class itself, without creating new object ========");
        System.out.println(Car.getCarCount());
    }
}
