/******************************************************************************
 * Q15. Calculate factorial of N — both iterative and recursive approaches.
 *
 * Example:
 *   Input : 6
 *   Output: 720
 *
 * Complexity: Time O(n)  |  Space O(1) iterative / O(n) recursive call stack
 * Difficulty: Easy
 ******************************************************************************/
public class FactorialIterativeAndRecursive {

    public static long factorialIterative(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input");
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    public static long factorialRecursive(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input");
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        for (int n = 0; n <= 10; n++) {
            System.out.printf("fact(%2d) iterative=%10d  recursive=%10d%n",
                n, factorialIterative(n), factorialRecursive(n));
        }
    }
}
