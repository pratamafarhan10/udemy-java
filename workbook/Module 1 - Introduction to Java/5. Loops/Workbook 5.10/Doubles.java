public class Doubles {
    public static void main(String[] args) {

        int dice1, dice2;

        while (true) {
            dice1 = (int) (Math.random() * 6 + 1);
            dice2 = (int) (Math.random() * 6 + 1);
            System.out.println("\nDice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);

            if (dice1 == dice2) {
                System.out.println("\nYou rolled doubles");
                break;
            }
        }

    }

}
