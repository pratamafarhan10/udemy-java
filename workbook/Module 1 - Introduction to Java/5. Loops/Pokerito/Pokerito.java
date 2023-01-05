import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
         * Task 2: Explain the rules
         * 
         * >>Let's play Pokerito. Type anything when you're ready.
         * |
         * >>It's like Poker, but a lot simpler.
         * >> (new line)
         * >> • There are two players, you and the computer.
         * >> • The dealer will give each player one card.
         * >> • Then, the dealer will draw five cards (the river)
         * >> • The player with the most river matches wins!
         * >> • If the matches are equal, everyone's a winner!
         * >> (new line)
         * >> • Ready? Type anything if you are.
         * |
         */

        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.");
        System.out.println("\n- There are two players, you and the computer.");
        System.out.println("- The dealer will give each player one card.");
        System.out.println("- Then, the dealer will draw five cards (the river)");
        System.out.println("- The player with the most river matches wins!");
        System.out.println("- If the matches are equal, everyone's a winner!");
        System.out.println("\n- Ready? Type anything if you are.");
        scan.nextLine();

        /*
         * Task 3: Present the user with a card
         * println 'Here's your card:'
         * <show card>
         * <new line>
         * println 'Here's the computer's card:'
         * <show computer's card>
         */

        System.out.println("Here's your card\n");

        int userCard = randomCard();
        System.out.println("\nHere's the computer's card:");
        int computerCard = randomCard();

        /**
         * Task 4 - Draw five cards
         * 
         * • print: Now, the dealer will draw five cards. Press enter to continue.
         * • The dealer will draw a card every time the user presses enter.
         * • Before you draw a card, print the order it was drawn in:
         * Card 1
         * <2 new lines>
         * <print card>
         * Card 2
         * <2 new lines>
         * <print card>
         * ...
         */

        int yourMatches = 0;
        int computerMatches = 0;

        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        scan.nextLine();
        System.out.println("The dealer will draw a card every time the user presses enter.");
        System.out.println("Before you draw a card, print the order it was drawn in:");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nCard " + (i + 1));
            int randCard = randomCard();

            if (randCard == userCard) {
                yourMatches++;
            }
            
            if (randCard == computerCard) {
                computerMatches++;
            }
        }

        /**
         * Task 5 - Get the winner
         * 
         * • Count your number of matches.
         * • Count the computer's number of matches.
         * • print: Your number of matches: <yourMatches>
         * • print: Computer number of matches: <computerMatches>
         * 
         * • If you have more matches, print: You win!.
         * • If the computer has more matches, print: The computer wins!
         * • If the matches are equal, print: everyone wins!.
         */

        System.out.println("Your number of matches: " + yourMatches);
        System.out.println("Computer number of matches: " + computerMatches);

        if (yourMatches > computerMatches) {
            System.out.println("You win!.");
        } else if (yourMatches < computerMatches) {
            System.out.println("The computer wins!");
        } else {
            System.out.println("Everyone wins!.");
        }

        scan.close();
    }

    /**
     * Task 1
     * 
     * Function name – randomCard
     * 
     * @return (int)
     * 
     *         Inside the function:
     *         1. Gets a random number between 1 and 13.
     *         2. Returns a card that matches the random number (get the int
     *         values from cards.text).
     */

    public static int randomCard() {
        int rand = (int) (Math.random() * 13 + 1);

        switch (rand) {
            case 1:
                System.out.println("   _____\n" +
                        "  |A _  |\n" +
                        "  | ( ) |\n" +
                        "  |(_'_)|\n" +
                        "  |  |  |\n" +
                        "  |____V|\n");
                return 1;
            case 2:
                System.out.println("   _____\n" +
                        "  |2    |\n" +
                        "  |  o  |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____Z|\n");
                return 2;
            case 3:
                System.out.println("   _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____E|\n");
                return 3;
            case 4:
                System.out.println("   _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____h|\n");
                return 4;
            case 5:
                System.out.println("   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n");
                return 5;
            case 6:
                System.out.println("   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n");
                return 6;
            case 7:
                System.out.println("   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n");
                return 7;
            case 8:
                System.out.println("   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n");
                return 8;
            case 9:
                System.out.println("   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n");
                return 9;
            case 10:
                System.out.println("   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n");
                return 10;
            case 11:
                System.out.println("   _____\n" +
                        "  |J  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o% |\n" +
                        "  | | % |\n" +
                        "  |__%%[|\n");
                return 11;
            case 12:
                System.out.println("   _____\n" +
                        "  |Q  ww|\n" +
                        "  | o {(|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%O|\n");
                return 12;
        }

        System.out.println("   _____\n" +
                "  |K  WW|\n" +
                "  | o {)|\n" +
                "  |o o%%|\n" +
                "  | |%%%|\n" +
                "  |_%%%>|\n");
        return 13;
    }

}
