public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", 10000, 2020, "Green");
        Car nissan = new Car("Nissan", 11000, 2019, "Blue");

        toyota.setColor("Jet Black");
        toyota.setPrice(toyota.getPrice()/2);

        System.out.println("This " + toyota.getBrand() + " is worth $" + toyota.getPrice() +
                ". It was built in " + toyota.getYear() + ". It is " + toyota.getColor() + ".\n");
        System.out.println("This " + nissan.getBrand() + " is worth $" + nissan.getPrice() +
                ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
    }
}
