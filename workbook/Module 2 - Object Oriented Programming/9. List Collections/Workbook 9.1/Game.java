import java.time.LocalDate;

public class Game {
    private String arena;
    private LocalDate date;

    public Game(String arena){
        this.arena = arena;
        this.date = LocalDate.now();
    }
}
