public class Movie {
    
    private String name;
    private String format;
    private double rating;

    public Movie(String name, String format, double rating) {
        setName(name);
        setFormat(format);
        setRating(rating);
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // TODO
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name can not be null");
        }
        this.name = name;
    }
    
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        // TODO
        if (format == null || format.isBlank()) {
            throw new IllegalArgumentException("format can not be null");
        }
        this.format = format;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        // TODO
        if (rating < 0) {
            throw new IllegalArgumentException("rating can not below 0");
        }
        
        if (rating > 10) {
            throw new IllegalArgumentException("rating can not above 10");
        }
        
        this.rating = rating;
    }

    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }    

}