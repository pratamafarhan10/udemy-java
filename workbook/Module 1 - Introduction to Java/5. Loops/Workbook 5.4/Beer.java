import java.util.Scanner;

public class Beer {
    public static void main(String[] args) {
        // See detailed instructions on Learn the Part.
        System.out.print("Hi Timmy! how many times you want this lyrics to run? ");

        Scanner scan = new Scanner(System.in);

        int counter = scan.nextInt();

        // sing(counter);
        anotherSing(counter);

        scan.close();
    }

    /**
     * Function name: sing
     * 
     * @param index (int)
     * 
     *              Inside the function:
     *              1. Loop over the amount of index
     *              2. Print lyrics
     */

    public static void sing(int index) {
        for (int i = index; i > 0; i--) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!");
            System.out.println("take one down, pass it around " + (i - 1) + ", bottles of beer on the wall!");
        }
    }

    public static void anotherSing(int index){
        for (int i = index; i > 0;) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!");
            System.out.println("take one down, pass it around " + (i -= 1) + ", bottles of beer on the wall!");
        }
    }

}
