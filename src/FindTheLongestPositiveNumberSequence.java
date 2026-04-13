import java.util.Arrays;

/******************************************************************************
 * Q04. Find the longest contiguous sequence of positive numbers in an array.
 *
 * Example:
 *   Input : {9, 12, -1, 3, 4, -9, 23, 45, 21, -87, 12345, 987, -31, 10}
 *   Output: [23, 45, 21]  (length 3)
 *
 * Approach : Single pass — maintain a current window and track the best.
 *
 * Complexity: Time O(n)  |  Space O(n)
 * Difficulty: Easy
 ******************************************************************************/
public class FindTheLongestPositiveNumberSequence {

    /**
     * Returns the longest contiguous sub-array of positive integers.
     *
     * @param arr the input array
     * @return sub-array with the most consecutive positive numbers
     */
    public static int[] longestPositiveSequence(int[] arr) {
        int bestStart = 0, bestLen = 0;
        int curStart  = 0, curLen  = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                curLen++;
                if (curLen > bestLen) {
                    bestLen   = curLen;
                    bestStart = curStart;
                }
            } else {
                curStart = i + 1;
                curLen   = 0;
            }
        }
        return Arrays.copyOfRange(arr, bestStart, bestStart + bestLen);
    }

    public static void main(String[] args) {
        int[] input  = {9, 12, -1, 3, 4, -9, 23, 45, 21, -87, 12345, 987, -31, 10};
        int[] result = longestPositiveSequence(input);
        System.out.println("Longest positive sequence: " + Arrays.toString(result));
        // [23, 45, 21]
    }
}
