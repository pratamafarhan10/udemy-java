import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            readFile("greetings.txt");
            // FileInputStream file = new FileInputStream("greetings.txt");

            // Scanner scan = new Scanner(file);
            // String text = "";
            // while (scan.hasNextLine()) {
            // text += scan.nextLine();
            // }

            // System.out.println(text);

            // scan.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Process complete");
        }
    }

    public static void readFile(String fileName) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("greetings.txt"));
        
        String text = readLine(reader);

        System.out.println(text);

        reader.close();
    }

    public static String readLine(BufferedReader reader) throws IOException {
        String text = "";

        while (reader.ready()) {
            text += reader.readLine();
        }

        return text;
    }
}
