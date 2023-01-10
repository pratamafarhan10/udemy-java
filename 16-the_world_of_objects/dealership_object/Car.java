import java.util.Arrays;

public class Car {
    private String brand;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car(String brand, double price, int year, String color, String[] parts) {
        this.brand = brand;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
        // this.parts = parts;
    }

    public Car(Car source) {
        this.brand = source.brand;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
        // this.parts = source.parts;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getParts() {
        // We should return the array copy of the parts. Because in another class, it
        // can be modified and it will modify directly in the object
        return Arrays.copyOf(this.parts, this.parts.length);
        // return this.parts;
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
        // this.parts = parts;
    }

    public void drive() {
        System.out.println("\nbrmm brmm, this " + this.brand + " is moving so fast!");
    }

    public String toString() {
        return "Make: " + this.brand + ".\n"
                + "Price: " + this.price + ".\n"
                + "Year: " + this.year + ".\n"
                + "Color: " + this.color + ".\n"
                + "Parts: " + Arrays.toString(parts) + ".\n";
    }
}
