public class IfElse {
    public static void main(String[] args) {
        int grade = 101;

        if (grade <= 100 && grade >= 70) {
            System.out.println("Congratulations you passed the test!");
        }else if (grade >= 30) {
            System.out.println("You got B!");
        }else if (grade >= 0 && grade < 30) {
            System.out.println("You got C!");
        }else {
            System.out.println("Incorrect grade");
        }
    }
}
