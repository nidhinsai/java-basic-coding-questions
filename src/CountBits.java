/******************************************************************************
 * Q49. Count Bits — for every number in [0, n] return the number of 1-bits.
 *
 * Example:
 *   Input : n = 5
 *   Output: {0, 1, 1, 2, 1, 2}
 *
 * Approach : DP — dp[i] = dp[i >> 1] + (i & 1)
 *
 * Complexity: Time O(n)  |  Space O(n)
 * Difficulty: Easy-Medium
 ******************************************************************************/
import java.util.Arrays;

public class CountBits {

    public static int[] countBits(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i >> 1] + (i & 1);
        }
        return dp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));  // [0,1,1,2,1,2]
        System.out.println(Arrays.toString(countBits(2)));  // [0,1,1]
    }
}
