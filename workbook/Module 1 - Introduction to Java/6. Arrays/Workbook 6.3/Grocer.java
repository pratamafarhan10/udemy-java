import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Instructions for this workbook are on Learn the Part (Workbook 6.3).
        String[] aisles = { "apples", "bananas", "candy", "chocolate", "coffee", "tea" };

        System.out.println("\nWhat do you want to buy?");
        String product = scan.nextLine();

        for (int i = 0; i < aisles.length; i++) {
            if (aisles[i].equalsIgnoreCase(product)) {
                System.out.println("\nWe have that in aisle: " + i);
                break;
            }

            if (i == aisles.length - 1) {
                System.out.println("\nSorry, we don't have that here");
            }
        }

        scan.close();
    }
}
