public class ReturnValue {
    public static void main(String[] args) {
        double area1 = rectangleArea(2.3, 3.5);
        double area2 = rectangleArea(1.6, 2.4);
        double area3 = rectangleArea(2.6, 4.3);

        System.out.println("2.3 x 3.5: " + area1);
        System.out.println("1.6 x 2.4: " + area2);
        System.out.println("2.6 x 4.3: " + area3);
    }

    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "area es igual a largo * ancho";
        }

        return "Language unavailable";
    }
}
