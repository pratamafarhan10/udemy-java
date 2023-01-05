import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("We are going to play dice role!");
        System.out.println("If we pull out the same number then the loop will ends");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nInput number between 1-6: ");

            int num = sc.nextInt();

            if (num < 1 || num > 6) {
                System.out.println("Please input a valid number");
                continue;
            }

            int randNum = (int) (Math.random() * 6 + 1);

            System.out.println("Your number: " + num);
            System.out.println("Computer number: " + randNum);

            if (num == randNum) {
                System.out.println("Finally end!");
                break;
            }
        }

        sc.close();
    }
}
