/******************************************************************************
 * Q13. Generate the first N numbers in the Fibonacci sequence.
 *
 * Example:
 *   Input : n = 8
 *   Output: 0 1 1 2 3 5 8 13
 *
 * Complexity: Time O(n)  |  Space O(1)
 * Difficulty: Easy
 ******************************************************************************/
public class FibonacciSequence {

    public static void printFibonacci(int n) {
        if (n <= 0) return;
        long a = 0, b = 1;
        System.out.print(a);
        for (int i = 1; i < n; i++) {
            System.out.print(" " + b);
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    /** Returns the nth Fibonacci number (0-indexed). */
    public static long fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long c = a + b; a = b; b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        printFibonacci(8);            // 0 1 1 2 3 5 8 13
        System.out.println(fibonacci(10)); // 55
    }
}
