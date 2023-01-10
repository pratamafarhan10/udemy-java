public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", 10000, 2020, "Green");
        Car nissan = new Car("Nissan", 11000, 2019, "Blue");

        System.out.println("This " + toyota.brand + " is worth $" + toyota.price +
                ". It was built in " + toyota.year + ". It is " + toyota.color + ".\n");
        System.out.println("This " + nissan.brand + " is worth $" + nissan.price +
                ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
    }
}
