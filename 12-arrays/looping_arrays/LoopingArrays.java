public class LoopingArrays {
    public static void main(String[] args) {
        String[] banks = { "BCA", "Mandiri", "BRI", "Jago", "Permata" };

        System.out.println("Without length");
        for (int i = 0; i < 5; i++) {
            System.out.println("Element at index " + i + ": " + banks[i]);
        }

        System.out.println("With length");
        for (int i = 0; i < banks.length; i++) {
            System.out.println("Element at index " + i + ": " + banks[i]);
        }
    }
}
