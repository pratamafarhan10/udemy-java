public class Main {
    public static void main(String[] args) {
        Person john = new Person("john", 43);
        Person john2 = new Person("john", 43);

        System.out.println(john);
        System.out.println(john2);

        john.setAge(50);

        System.out.println("John age: " + john.getAge());
        System.out.println("John 2 age: " + john2.getAge());
    }
}
