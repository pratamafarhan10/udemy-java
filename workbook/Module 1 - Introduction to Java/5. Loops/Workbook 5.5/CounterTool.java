import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        // See detailed instructions on Learn the Part.
        System.out.print("1. Pick a number to count by: ");
        int countBy = scan.nextInt();

        System.out.print("2. Pick a number to start counting from: ");
        int from = scan.nextInt();

        System.out.print("3. Pick a number to count to: ");
        int to = scan.nextInt();

        if (from > to) {
            System.out.println("Error: from is greater than to");
            System.exit(0);
        }

        for(;from <= to; from += countBy){
            System.out.print(from + " ");
        }

        scan.close();
    }
}
