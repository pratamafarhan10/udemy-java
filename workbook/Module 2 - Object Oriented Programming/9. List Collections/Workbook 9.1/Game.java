import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Game {
    private String arena;
    private LocalDate date;

    public Game(String arena) {
        this.arena = arena;
        this.date = LocalDate.now();
    }

    public String begin() {
        return "\n - This matchup takes place at the " + this.arena + " arena on " + this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ".";
    }
}
