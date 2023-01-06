import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] priceAfterTax = new double[price.length];

        for (int i = 0; i < priceAfterTax.length; i++) {
            priceAfterTax[i] = price[i] + (price[i] * 13 / 100);
        }

        // See instructions on Learn the Part (Workbook 6.9)
        System.out.println("The original prices are: " + Arrays.toString(price));
        System.out.println("The prices after tax are: " + Arrays.toString(priceAfterTax));

    }
}
