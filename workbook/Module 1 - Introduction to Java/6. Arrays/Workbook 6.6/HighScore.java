public class HighScore {
    public static void main(String[] args) {
        int[] scores = { randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(), randomNumber() };

        int highScore = 0;
        System.out.print("Here are the scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
            if (scores[i] > highScore) {
                highScore = scores[i];
            }
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Impressive!");

        // TODO : See instructions on Learn the Part (Workbook 6.6)
        for (int i = 0; i < scores.length; i++) {
            if (highScore == scores[i]) {
                System.out.println("It's the gentleman in seat: " + i + ". Give that man a cookie!");
                break;
            }
        }

    }

    public static int randomNumber() {
        double randomDouble = Math.random() * 50000;
        int randomInt = (int) randomDouble;
        return randomInt;
    }
}
