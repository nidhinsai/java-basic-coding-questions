/******************************************************************************
 * Q37. Check if a number is a power of two.
 *
 * Example:
 *   Input : 16  →  true   (2^4)
 *   Input : 18  →  false
 *
 * Approach : Bit trick — a power of two has exactly one set bit.
 *            n & (n-1) clears the lowest set bit; result is 0 iff only one bit.
 *
 * Complexity: Time O(1)  |  Space O(1)
 * Difficulty: Easy
 ******************************************************************************/
public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int[] tests = {1, 2, 3, 4, 16, 18, 1024, 1000};
        for (int t : tests) {
            System.out.printf("%6d  →  %s%n", t, isPowerOfTwo(t));
        }
    }
}
