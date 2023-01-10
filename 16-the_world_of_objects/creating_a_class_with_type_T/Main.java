public class Main {
    public static void main(String[] args) {
        A<String> str = new A<String>();

        str.add("This is a string");

        System.out.println(str.getAttr());
        System.out.println();

        Integer[] nums = {1, 2, 3, 4};
        print(nums);
    }

    public static<E> void print(E[] elements){
        for (E element : elements) {
            System.out.println(element);
        }
    }
}
