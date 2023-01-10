import java.util.Scanner;

public class Main {

    static Store store = new Store();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Movie[] movies = new Movie[] {
                new Movie("The Shawshank Redemption", "BlueRay", 9.2),
                new Movie("The Godfather", "BlueRay", 9.1),
                new Movie("The Godfather: Part II", "DVD", 9.0),
                new Movie("12 Angry Men", "DVD", 8.9),
                new Movie("The Dark Knight", "BlueRay", 9.0),
                new Movie("Schindler's List", "DVD", 8.9),
                new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
                new Movie("Pulp Fiction", "DVD", 8.8),
                new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
                new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

        // TODO: populate the store object (defined on top) with movies before printing
        // it
        for (int i = 0; i < movies.length; i++) {
            store.setMovie(i, movies[i]);
        }

        printStore();

        boolean isContinue = true;

        while (isContinue) {
            System.out.print("Please choose an integer between 0 - 9: ");
            int movieIndex = scan.nextInt();
            Movie choice = store.getMovie(movieIndex);
            System.out.print("Set a new rating for " + choice.getName() + " : ");
            double newRating = scan.nextDouble();

            choice.setRating(newRating);
            store.setMovie(movieIndex, choice);

            printStore();

            scan.nextLine();
            System.out.print("\nTo edit another rating, type: 'continue': ");

            isContinue = scan.next().equalsIgnoreCase("Continue");
        }

        scan.close();
    }

    public static void printStore() {
        System.out.println("********************************MOVIE STORE*******************************");
        System.out.println(store);
    }

}
