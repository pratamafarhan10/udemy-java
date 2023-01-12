import product.Pants;
import product.Product;
import product.Shirt;
import product.Shirt.Size;;

public class Main {

    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        shirt.setBrand("Nike");
        shirt.setColor("Blue");
        shirt.setPrice(49.99);
        shirt.setSize(Size.MEDIUM);

        shirt.fold();

        Pants pants = new Pants();
        pants.setBrand("Adidas");
        pants.setColor("Black");
        pants.setPrice(29.99);
        pants.setLength(75);
        pants.setWaist(80);

        sell(shirt);
        sell(pants);
    }

    public static void sell(Product product){
        System.out.println("Thank you for buying this " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase());
    }

}
