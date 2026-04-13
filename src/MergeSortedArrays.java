import java.util.Arrays;

/******************************************************************************
 * Q24. Merge two sorted arrays into one sorted array.
 *
 * Example:
 *   Input : {1, 3, 5}, {2, 4, 6}
 *   Output: {1, 2, 3, 4, 5, 6}
 *
 * Approach : Two-pointer merge (same logic as merge step in MergeSort).
 *
 * Complexity: Time O(m + n)  |  Space O(m + n)
 * Difficulty: Easy
 ******************************************************************************/
public class MergeSortedArrays {

    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            result[k++] = (a[i] <= b[j]) ? a[i++] : b[j++];
        }
        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1,3,5}, new int[]{2,4,6})));
        // [1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(merge(new int[]{1,2,3}, new int[]{})));
        // [1, 2, 3]
    }
}
