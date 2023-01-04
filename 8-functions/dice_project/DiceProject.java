import java.util.Scanner;

public class DiceProject {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 3 numbers between 1 and 6");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (isInputInvalid(num1, num2, num3)) {
            System.out.println("Please input number between 1-6");
            System.exit(0);
        }

        int randNum1 = diceRandom();
        int randNum2 = diceRandom();
        int randNum3 = diceRandom();

        System.out.println("Dice sum: " + (randNum1 + randNum2 + randNum3) + ". Number sum = " + (num1 + num2 + num3));

        printWinner(randNum1 + randNum2 + randNum3, num1 + num2 + num3);

        scan.close();
    }

    public static int diceRandom() {
        return (int)(Math.random() * (6 - 1 + 1) + 1);
    }

    public static void printWinner(int diceSum, int numberSum) {
        if (checkWinner(diceSum, numberSum)) {
            System.out.println("Congratulations! You win!");
        } else {
            System.out.println("Sorry, you lose");
        }
    }

    public static boolean checkWinner(int diceSum, int numberSum){
        if (diceSum < numberSum && numberSum - diceSum < 3) {
            return true;
        }

        return false;
    }

    public static boolean isInputInvalid(int num1, int num2, int num3){
        if (num1 < 1 || num2 < 1 || num3 < 1 || num1 > 6 || num2 > 6 || num3 > 6) {
            return true;
        }

        return false;
    }

}
