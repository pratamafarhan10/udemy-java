import product.Shirt;
import product.Shirt.Size;

public class Main {

    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        shirt.setBrand("Nike");
        shirt.setColor("Blue");
        shirt.setPrice(49.99);
        shirt.setSize(Size.MEDIUM);

        shirt.fold();
    }

}
