import java.util.Arrays;

/******************************************************************************
 * Q47. Implement Merge Sort.
 *
 * Example:
 *   Input : {38, 27, 43, 3, 9, 82, 10}
 *   Output: {3, 9, 10, 27, 38, 43, 82}
 *
 * Approach : Divide-and-conquer recursion.
 *
 * Complexity: Time O(n log n)  |  Space O(n)
 * Difficulty: Medium
 ******************************************************************************/
public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] tmp = Arrays.copyOfRange(arr, left, right + 1);
        int i = 0, j = mid - left + 1, k = left;
        while (i <= mid - left && j <= right - left) {
            arr[k++] = (tmp[i] <= tmp[j]) ? tmp[i++] : tmp[j++];
        }
        while (i <= mid - left) arr[k++] = tmp[i++];
        while (j <= right - left) arr[k++] = tmp[j++];
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr)); // [3, 9, 10, 27, 38, 43, 82]
    }
}
