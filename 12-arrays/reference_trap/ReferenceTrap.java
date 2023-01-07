import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        int[] numbers = {1, 2 ,3};
        int[] numbers2 = numbers;

        numbers2[1] = 5;

        System.out.println(numbers);
        System.out.println(numbers2);

        System.out.println(Arrays.toString(numbers));

        // Copy the array into the new array using loop
        System.out.println("===== Copy the array into the new array using loop");
        int[] numbers3 = new int[numbers.length];

        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = numbers[i];
        }

        System.out.println(Arrays.toString(numbers3));
        numbers3[2] = 10;
        System.out.println(Arrays.toString(numbers3));

        // Copy the array into the new array using clone
        System.out.println("===== Copy the array into the new array using clone");
        int[] numbers4 = numbers.clone();
        System.out.println(Arrays.toString(numbers4));
        numbers4[2] = 10;
        System.out.println(Arrays.toString(numbers4));

        // Copy the array into the new array using Arrays.copyOf
        System.out.println("===== Copy the array into the new array using Arrays.copyOf");
        int[] numbers5 = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(numbers5));
        numbers5[2] = 10;
        System.out.println(Arrays.toString(numbers5));

        // Copy the array into the new array using Arrays.copyOf
        System.out.println("===== Copy the array into the new array using Arrays.copyOf but just take several elements from 0");
        int[] numbers6 = Arrays.copyOf(numbers, 2);
        System.out.println(Arrays.toString(numbers6));

        // Copy the array into the new array using Arrays.copyOf
        System.out.println("===== Copy the array into the new array using Arrays.copyOfRange to take several part of array");
        int[] numbers7 = Arrays.copyOfRange(numbers, 1, 3);
        System.out.println(Arrays.toString(numbers7));
    }    
}
