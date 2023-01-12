public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", 10000, 2020, "Green");

        System.out.println("======== STATIC FINAL CONSTANT========\n");
        System.out.println("The tax percentage of each car is: " + Car.TAX_PERCENTAGE + "%");
        System.out.println("The toyota car price before tax: " + toyota.getPrice());
        System.out.println("The toyota car price after tax: " + toyota.getPriceAfterTax());

    }
}
