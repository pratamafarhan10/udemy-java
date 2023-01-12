import java.time.LocalDate;
import static java.lang.Math.floor;
import java.time.format.DateTimeFormatter;

public class Game {
    private String arena;
    private LocalDate date;
    private double price;
    private static final double BASE_PRICE = 2000;
    private static final double TAX = 5;

    public Game(String arena) {
        this.arena = arena;
        this.date = LocalDate.now();
        this.price = floor(BASE_PRICE + (BASE_PRICE * TAX / 100));
    }

    public String begin() {
        return "\n - This matchup takes place at the " + this.arena + " arena on " + this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ".";
    }
}
