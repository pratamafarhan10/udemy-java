import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        if (input < 0) {
            System.out.println("Sorry, age cannot be negative");
        }else {
            age(input);
        }

        scan.close();
    }

    public static void age(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        System.out.println(age);
    }
}
