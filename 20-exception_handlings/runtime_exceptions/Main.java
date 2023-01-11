import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= ArrayOutOfBoundsException =========");
        int[] nums = new int[] { 1, 2, 3 };

        System.out.println(nums[2]);

        System.out.println("========= NullPointerException =========");
        String[] strs = new String[4];
        strs[0] = "john";

        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null) {
                strs[i] = strs[i].toUpperCase();
            }
        }

        System.out.println("========= InputMismatchException =========");
        Scanner scan = new Scanner(System.in);

        if (scan.hasNextInt()) {
            scan.nextInt();
        }

        scan.close();
    }
}
