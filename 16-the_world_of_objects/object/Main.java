public class Main {
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.brand = "Toyota";
        toyota.price = 10000;
        toyota.year = 2020;
        toyota.color = "Green";

        Car nissan = new Car();
        nissan.brand = "Nissan";
        nissan.price = 11000;
        nissan.year = 2022;
        nissan.color = "Blue";

        System.out.println("This " + toyota.brand + " is worth $" + toyota.price +
                ". It was built in " + toyota.year + ". It is " + toyota.color + ".\n");
        System.out.println("This " + nissan.brand + " is worth $" + nissan.price +
                ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
    }
}
