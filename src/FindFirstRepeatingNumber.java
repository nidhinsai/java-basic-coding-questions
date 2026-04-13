import java.util.HashSet;
import java.util.Set;

/******************************************************************************
 * Q02. Find the first element that repeats in an integer array.
 *
 * Example:
 *   Input : {2, 6, 8, 3, 6, 3, 8}
 *   Output: 6
 *
 * Approach : Use a HashSet.  For each element, check membership before adding.
 *            The first element already in the set is the answer.
 *
 * Complexity: Time O(n)  |  Space O(n)
 * Difficulty: Easy
 ******************************************************************************/
public class FindFirstRepeatingNumber {

    /**
     * Returns the first repeating element, or {@code -1} if none exists.
     *
     * @param arr the input integer array
     * @return first repeating integer
     */
    public static int findFirstRepeating(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = {2, 6, 8, 3, 6, 3, 8};
        int result = findFirstRepeating(input);
        if (result != -1) {
            System.out.println("First repeating element: " + result); // 6
        } else {
            System.out.println("No repeating element found.");
        }
    }
}
