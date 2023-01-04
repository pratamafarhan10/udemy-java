
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciRecursive(3));
        System.out.println(fibonacciRecursive(5));
    }

    public static int fibonacciRecursive(int index){
        if (index < 2){
            return index;
        }

        return fibonacciRecursive(index-1) + fibonacciRecursive(index-2);
    }
}
