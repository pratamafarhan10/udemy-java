package bus;

public class Bus {
    public static void main(String[] args) {
        int passengers = 0;

        passengers += 9;
        System.out.println("9 passengers enter, current passenger: " + passengers);

        passengers -= 5;
        System.out.println("5 passengers drop, current passenger" + passengers);

        passengers -= 4;
        System.out.println("4 passengers drop, current passenger" + passengers);
    }
}
