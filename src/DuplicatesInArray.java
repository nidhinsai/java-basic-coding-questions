import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/******************************************************************************
 * Q18. Find ALL duplicate elements in an integer array.
 *
 * Example:
 *   Input : {1, 2, 3, 2, 4, 3, 5}
 *   Output: [2, 3]
 *
 * Approach : Two HashSets — one for seen elements, one for recorded duplicates.
 *
 * Complexity: Time O(n)  |  Space O(n)
 * Difficulty: Easy
 ******************************************************************************/
public class DuplicatesInArray {

    public static List<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen  = new HashSet<>();
        Set<Integer> dupes = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) dupes.add(num);
        }
        return new ArrayList<>(dupes);
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 2, 4, 3, 5};
        System.out.println("Duplicates: " + findDuplicates(input)); // [2, 3]
        System.out.println(findDuplicates(new int[]{1, 1, 1}));      // [1]
        System.out.println(findDuplicates(new int[]{1, 2, 3}));      // []
    }
}
