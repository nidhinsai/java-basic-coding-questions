/******************************************************************************
 * Q29. Find the second largest element in an array — single pass, no sorting.
 *
 * Example:
 *   Input : {12, 35, 1, 10, 34, 1}
 *   Output: 34
 *
 * Complexity: Time O(n)  |  Space O(1)
 * Difficulty: Easy
 ******************************************************************************/
public class SecondLargestElement {

    public static int secondLargest(int[] arr) {
        if (arr.length < 2) throw new IllegalArgumentException("Need at least 2 elements");
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max)               { second = max; max = x; }
            else if (x > second && x != max) { second = x; }
        }
        if (second == Integer.MIN_VALUE) throw new IllegalArgumentException("No distinct second largest");
        return second;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{12, 35, 1, 10, 34, 1})); // 34
        System.out.println(secondLargest(new int[]{5, 5, 4, 3}));           // 4
    }
}
