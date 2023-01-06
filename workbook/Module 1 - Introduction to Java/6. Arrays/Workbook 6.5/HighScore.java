public class HighScore {
    public static void main(String[] args) {
        
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.5).
        int[] scores = new int[10];

        System.out.print("Here are the scores: ");

        for (int i = 0; i < 10; i++) {
            scores[i] = randomNumbers();
            System.out.print(scores[i] + " ");
        }

        int highScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i];
            }
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
        
    }

    /**
     * randomNumbers
     * @return int
     * 
     * Generate random number between 0 - 49999
     */

    public static int randomNumbers(){
        return (int) (Math.random() * (49999 - 0 + 1) + 0);
    }

}
