/******************************************************************************
 * Q20. Binary Search — find an element in a sorted array.
 *
 * Example:
 *   Input : arr = {1, 3, 5, 7, 9, 11}, target = 7
 *   Output: index 3
 *
 * Approach : Iterative binary search — avoid integer overflow with
 *            mid = left + (right - left) / 2.
 *
 * Complexity: Time O(log n)  |  Space O(1)
 * Difficulty: Easy
 ******************************************************************************/
public class BinarySearch {

    /**
     * Returns the index of {@code target} in the sorted array, or -1 if absent.
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if      (arr[mid] == target) return mid;
            else if (arr[mid] <  target) left  = mid + 1;
            else                        right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println(binarySearch(arr, 7));   // 3
        System.out.println(binarySearch(arr, 6));   // -1
        System.out.println(binarySearch(arr, 1));   // 0
        System.out.println(binarySearch(arr, 11));  // 5
    }
}
