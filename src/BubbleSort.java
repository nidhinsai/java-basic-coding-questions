import java.util.Arrays;

/******************************************************************************
 * Q21. Implement Bubble Sort.
 *
 * Example:
 *   Input : {64, 25, 12, 22, 11}
 *   Output: {11, 12, 22, 25, 64}
 *
 * Approach : Repeated passes, swapping adjacent out-of-order elements.
 *            Early termination if no swap occurred in a pass.
 *
 * Complexity: Time O(n²) worst/avg  |  O(n) best (already sorted)
 *             Space O(1)
 * Difficulty: Easy
 ******************************************************************************/
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp  = arr[j];
                    arr[j]   = arr[j + 1];
                    arr[j+1] = tmp;
                    swapped  = true;
                }
            }
            if (!swapped) break;   // already sorted
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr)); // [11, 12, 22, 25, 64]
    }
}
