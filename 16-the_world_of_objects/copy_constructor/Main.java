public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", 10000, 2020, "Green");
        Car nissan = new Car("Nissan", 11000, 2019, "Blue");

        Car nissan2 = new Car(nissan);

        nissan2.setColor("Yellow");
        nissan.setColor("Orange");
        nissan2.setColor("Blue");
        nissan.setColor("Purple");
        nissan2.setColor("Fuchsia");
        nissan.setColor("Beige");

        System.out.println("This " + toyota.getBrand() + " is worth $" + toyota.getPrice() +
                ". It was built in " + toyota.getYear() + ". It is " + toyota.getColor() + ".\n");
        System.out.println("This " + nissan.getBrand() + " is worth $" + nissan.getPrice() +
                ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        System.out.println("This " + nissan2.getBrand() + " is worth $" + nissan2.getPrice() +
                ". It was built in " + nissan2.getYear() + ". It is " + nissan2.getColor() + ".\n");
        toyota.drive();
        nissan.drive();
        nissan2.drive();
    }
}
