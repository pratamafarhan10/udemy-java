import java.util.Scanner;

public class Delimiter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two integer values (On the same line)");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Enter two double values (On the same line)");
        double decimal1 = sc.nextDouble();
        double decimal2 = sc.nextDouble();

        System.out.println("Enter two long values (On the same line)");
        long bigNumber1 = sc.nextLong();
        long bigNumber2 = sc.nextLong();

        System.out.println("Enter two string values (On the same line)");
        String text1 = sc.next();
        String text2 = sc.next();

        System.out.println("Enter two string values (On the same line)");
        sc.nextLine();
        String oneLine = sc.nextLine();

        System.out.println("\tIntegers: " + num1 + " " + num2);
        System.out.println("\tDecimal: " + decimal1 + " " + decimal2);
        System.out.println("\tDouble: " + bigNumber1 + " " + bigNumber2);
        System.out.println("\tString: " + text1 + " " + text2);
        System.out.println("\tString with nextLine(): " + oneLine);

        sc.close();
    }
}
