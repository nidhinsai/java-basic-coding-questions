import java.util.Arrays;

/******************************************************************************
 * Q07. Find the maximum product of any three integers in an array.
 *
 * Example:
 *   Input : {12, 34, 7, 6, 8, 1}
 *   Output: 3264  (34 * 12 * 8)
 *
 * Approach : Sort the array.  The answer is the maximum of:
 *   - (last three elements):          arr[n-1] * arr[n-2] * arr[n-3]
 *   - (two smallest + one largest):   arr[0]   * arr[1]   * arr[n-1]
 *   The second case handles two large negatives multiplied by the max positive.
 *
 * Complexity: Time O(n log n)  |  Space O(1)
 * Difficulty: Easy-Medium
 ******************************************************************************/
public class MaxProductOfThree {

    /**
     * Returns the maximum product of any three distinct-index elements.
     *
     * @param arr the input array (length >= 3)
     * @return maximum product of three integers
     */
    public static long maxProductOfThree(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        long topThree  = (long) arr[n-1] * arr[n-2] * arr[n-3];
        long twoNegOne = (long) arr[0]   * arr[1]   * arr[n-1];
        return Math.max(topThree, twoNegOne);
    }

    public static void main(String[] args) {
        System.out.println(maxProductOfThree(new int[]{12, 34, 7, 6, 8, 1}));       // 3264
        System.out.println(maxProductOfThree(new int[]{-10, -10, 5, 2}));            // 500  (-10*-10*5)
        System.out.println(maxProductOfThree(new int[]{1, 2, 3}));                   // 6
    }
}
