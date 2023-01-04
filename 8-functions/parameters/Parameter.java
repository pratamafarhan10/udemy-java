public class Parameter {
    public static void main(String[] args) {
        System.out.println("2.3 x 3.5: " + rectangleArea(2.3, 3.5));
        System.out.println("1.6 x 2.4: " + rectangleArea(1.6, 2.4));
        System.out.println("2.6 x 4.3: " + rectangleArea(2.6, 4.3));
    }

    public static double rectangleArea(double length, double width){
        return length * width;
    }
}
