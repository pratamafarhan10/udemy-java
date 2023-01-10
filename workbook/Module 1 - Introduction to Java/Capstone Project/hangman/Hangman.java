import java.util.Scanner;

public class Hangman {

    public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
            "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
            "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
            "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
            "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
            "wombat", "zebra" };

    public static String[] gallows = { "+---+\n" +
            "|   |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|   |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" + // if you were wondering, the only way to print '\' is with a trailing escape
                                  // character, which also happens to be '\'
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/    |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/ \\  |\n" +
                    "     |\n" +
                    " =========\n" };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] wrongAnswer = new char[6];
        int wrongCounter = 0;

        String answer = randomWords();
        char[] rightAnswer = populate(answer.length());
        int correctCounter = 0;

        while (true) {
            if (correctCounter == answer.length()) {
                System.out.println("\nGOOD WORK!");
                break;
            }

            if (wrongCounter == 6) {
                System.out.println("\n" + gallows[wrongCounter]);
                System.out.println("RIP!");
                System.out.println("The word was: '" + answer + "'");
                break;
            }

            System.out.println("\n" + gallows[wrongCounter]);
            System.out.print("Word: ");
            printAnswer(rightAnswer);

            System.out.print("Misses: " );
            printAnswer(wrongAnswer);

            System.out.print("Guess: ");

            char userInput = scan.next().charAt(0);
            scan.nextLine();

            int check = checkCharacter(userInput, answer);

            if (check >= 0) {
                rightAnswer[check] = userInput;
                correctCounter++;
            } else {
                wrongAnswer[wrongCounter] = userInput;
                wrongCounter++;
            }

        }

        scan.close();

    }

    public static String randomWords() {
        int num = (int) (Math.random() * (words.length - 0 + 1) + 0);

        return words[num];
    }

    public static char[] populate(int length) {
        char[] chars = new char[length];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = '_';
        }

        return chars;
    }

    public static int checkCharacter(char input, String answer) {
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == input) {
                return i;
            }
        }

        return -1;
    }

    public static void printAnswer(char[] answer) {
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.println();
    }
}
