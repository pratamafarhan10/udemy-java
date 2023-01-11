import java.util.Objects;

public class City {
    private String name;
    private double population;

    public City(String name, double population){
        this.name = name;
        this.population = population;
    }

    public City(City source){
        this.name = source.name;
        this.population = source.population;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return this.population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof City)) {
            return false;
        }
        City city = (City) o;
        return Objects.equals(name, city.name) && population == city.population;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population);
    } 
    
}
