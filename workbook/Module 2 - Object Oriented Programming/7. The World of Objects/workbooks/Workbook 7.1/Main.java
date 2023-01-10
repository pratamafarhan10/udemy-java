import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person john = new Person();
        john.name = "John";
        john.nationality = "Indonesian";
        john.dateOfBirth = "02 February 2000";
        john.passport = new String[]{"Indonesian", "England"};
        john.seatNumber = 12;

        System.out.println(john.name);
        System.out.println(john.nationality);
        System.out.println(john.dateOfBirth);
        System.out.println(Arrays.toString(john.passport));
        System.out.println(john.seatNumber);

    }
}
