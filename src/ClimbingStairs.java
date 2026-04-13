/******************************************************************************
 * Q42. Climbing Stairs — in how many distinct ways can you climb N stairs if
 *      you can take 1 or 2 steps at a time?
 *
 * Example:
 *   Input : n = 5  →  8
 *
 * Key Insight : f(n) = f(n-1) + f(n-2)  — identical to Fibonacci.
 *
 * Complexity: Time O(n)  |  Space O(1)
 * Difficulty: Easy        ← LeetCode #70
 ******************************************************************************/
public class ClimbingStairs {

    public static long climbStairs(int n) {
        if (n <= 1) return 1;
        long a = 1, b = 1;
        for (int i = 2; i <= n; i++) {
            long c = a + b; a = b; b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            System.out.printf("n=%2d  ways=%d%n", n, climbStairs(n));
        }
    }
}
