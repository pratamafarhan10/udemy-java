public class Logical {
    public static void main(String[] args) {
        int englishGrade = 63;
        int chemistryGrade = 63;
        String lang = "Java";

        if (englishGrade > 75 || chemistryGrade > 75 || lang.equals("Java")) {
            System.out.println("Congratulations! you got the scholarship");
        }else {
            System.out.println("Sorry, you didn't get the scholarship");
        }
        
        int credits = 56;
        double gpa = 3.2;

        if (credits >= 40 && gpa >= 2.0) {
            System.out.println("You earned a diploma!");
        }else {
            System.out.println("Sorry, you need at least 40 credits and 2.0 gpa");
        }
    }
}
