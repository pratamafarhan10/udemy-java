public class Switch {
    public static void main(String[] args) {
        String platform = "udemy";

        switch (platform) {
            case "youtube":
                System.out.println("You are learning from youtube");
                break;
            case "udemy":
                System.out.println("You are learning from udemy");
                break;
            default: 
                System.out.println("The platform is unrecognized");
                break;
        }
    }
}