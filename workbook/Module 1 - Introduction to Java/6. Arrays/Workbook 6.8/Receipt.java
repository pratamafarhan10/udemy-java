public class Receipt {
    public static void main(String[] args) {

        String[] appleProducts = {"Iwatch", "Ipad", "Mabook Pro M1"};
        double[] prices = {1.99, 1.49, 1.29};

        System.out.println("Here's your receipt:\n");
        
        // See instructions on Learn the Part (Workbook 6.8)

        for (int i = 0; i < prices.length; i++) {
            System.out.println("\t" + appleProducts[i] +": $" + prices[i]); // to be used in for loop.
        }
        
    }
}
