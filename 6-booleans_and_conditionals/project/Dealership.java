import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Dealership");
        System.out.println("- Select option 'a' to buy a car");
        System.out.println("- Select option 'b' to sell a car");

        Scanner sc = new Scanner(System.in);

        String option = sc.nextLine();

        switch (option) {
            case "a":
                System.out.println("\nWhat is your budget");
                int budget = sc.nextInt();

                if (budget > 10000) {
                    System.out.println("\nGreat! a Nissan Altima is available for $12000");
                } else {
                    System.out.println("\nWe don't sell cars under $10,000");
                    break;
                }

                System.out.println("\nDo you have insurance? write 'yes' or 'no'");
                sc.nextLine();
                String hasInsurance = sc.nextLine();

                System.out.println("\nDo you have a license? write 'yes' or 'no'");
                String hasLicense = sc.nextLine();

                System.out.println("\nWhat is your credit score?");
                int creditScore = sc.nextInt();

                if (hasInsurance.equals("no") || hasLicense.equals("no") || creditScore < 660) {
                    System.out.println("We're sorry, you're not eligible");
                    break;
                }

                System.out.println("\nSold! Pleasure doing business with you");
                break;
            case "b":
                // The dealership only buys car that has selling price lower than the car's
                // value and the selling price is lower than 30k

                System.out.println("\nWhat car do you want to sell?");
                String carName = sc.nextLine();

                System.out.println("\nHow much is the car's value?");
                int carValue = sc.nextInt();

                System.out.println("\nHow much do you want to sell it?");
                int sellingPrice = sc.nextInt();

                if (sellingPrice < carValue && sellingPrice < 30000) {
                    System.out.println("\nSold! Pleasure doing business with you");
                } else {
                    System.out.println("\nSorry, we can't buy your " + carName);
                }
                break;
            default:
                System.out.println("Option not available");
                break;
        }
        sc.close();
    }
}
