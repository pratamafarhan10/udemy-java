public class Calendar {
    public static void main(String[] args) {

        // See Learn the Part for the complete instructions (link in resources folder of
        // Udemy video).

        String day = "Friday"; // Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");

        System.out.println("Hmm, let me check my calendar.");

        // Check 'calendar' here:
        switch (day) {
            case "Sunday":
                System.out.println("Certainly!");
                break;
            case "Monday":
                System.out.println("Can't");
                break;
            case "Tuesday":
                System.out.println("Busy.");
                break;
            case "Wednesday":
                System.out.println("Let's do it!");
                break;
            case "Thursday":
                System.out.println("Yeah!");
                break;
            case "Friday":
                System.out.println("Perhaps!");
                break;
            case "Saturday":
                System.out.println("Sure!");
                break;
        }
    }
}
