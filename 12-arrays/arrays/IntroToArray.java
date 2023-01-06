public class IntroToArray {
    public static void main(String[] args) {
        int[] integers;
        integers = new int[]{1, 2, 3, 4};



        // double[] decimals = {2.3, 3.5, 9.2};
        char[] characters = {'B', 'Y', 'T', 'E'};

        String newStr = String.valueOf(characters);
        System.out.println(newStr);

        String[] words = {"University", "City", "Bank"};

        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        // System.out.println(words[3]); // Error out of bounds
    }
}
