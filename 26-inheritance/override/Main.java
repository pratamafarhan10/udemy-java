import product.Pants;
import product.Product;
import product.Shirt;
import product.Shirt.Size;;

public class Main {

    public static void main(String[] args) {
        Shirt shirt = new Shirt(49.99, "BLUE", "NIKE", Size.MEDIUM);
        shirt.fold();

        Pants pants = new Pants(29.99, "BLACK", "ADIDAS", 39, 39);

        shirt.fold();
        pants.fold();

        sell(shirt);
        sell(pants);
    }

    public static void sell(Product product){
        System.out.println("Thank you for buying this " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase());
    }

}
