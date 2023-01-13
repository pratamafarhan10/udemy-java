import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("emails.txt");
        try {
            Files.lines(path)
                    .filter(email -> !email.startsWith("Spam"))
                    .forEach(email -> System.out.println(email));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
