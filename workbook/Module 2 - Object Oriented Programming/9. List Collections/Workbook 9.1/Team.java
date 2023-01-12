import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Team {
    private String name;
    private Map<String, String> players;

    public Team(String name) {
        this.name = name;
        this.players = new HashMap<>();
    }

    public String getName() {
        // return the name
        return this.name;
    }

    public void setName(String name) {
        // set the name
        this.name = name;
    }

    public String getPlayer(String position) {
        // return a player from the HashMap.
        return this.players.get(position);
    }

    public void setPlayer(String position, String player) {
        // Add a <String, String> entry into the HashMap
        this.players.put(position, player);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Team)) {
            return false;
        }
        Team team = (Team) o;
        return Objects.equals(name, team.name) && Objects.equals(players, team.players);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, players);
    }
}
