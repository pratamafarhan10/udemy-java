public class Comparisons {
    public static void main(String[] args) {
        String name1 = "farhan";
        String name2 = "farhan";
        String name3 = "Farhan";

        int num1 = 5;
        int num2 = 5;

        // >
        System.out.println("num1 > num2: " + (num1 > num2));

        // <
        System.out.println("num1 < num2: " + (num1 < num2));

        // >=
        System.out.println("num1 >= num2: " + (num1 >= num2));

        // <=
        System.out.println("num1 <= num2: " + (num1 <= num2));

        // ==
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("name1 == name2: " + (name1 == name2));

        // !=
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("name1 != name2: " + (name1 != name2));

        // equals for string
        System.out.println("name1 equals name2: " + (name1.equals(name2)));
        System.out.println("name1 equals name3: " + (name1.equals(name3)));

        // not equals for string
        System.out.println("name1 not equals name2: " + (!name1.equals(name2)));
        System.out.println("name1 not equals name3: " + (!name1.equals(name3)));
    }
}
