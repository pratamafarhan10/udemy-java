public class Car {
    private String brand;
    private double price;
    private int year;
    private String color;

    public Car(String brand, double price, int year, String color){
        this.brand = brand;
        this.price = price;
        this.year = year;
        this.color = color;
    }

    public Car(Car source){
        this.brand = source.brand;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
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
 
    public void drive(){
        System.out.println("\nbrmm brmm, this " + this.brand + " is moving so fast!");
    }
}
