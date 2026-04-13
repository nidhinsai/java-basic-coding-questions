import java.util.HashMap;
import java.util.Map;

/******************************************************************************
 * Q35. Given an integer array, check whether any two DISTINCT indices i, j
 *      exist such that nums[i] == nums[j] and abs(i - j) <= k.
 *
 * Example:
 *   Input : nums = {1, 2, 3, 1}, k = 3  →  true
 *   Input : nums = {1, 0, 1, 1}, k = 1  →  true
 *   Input : nums = {1, 2, 3, 1, 2, 3},  k = 2  →  false
 *
 * Complexity: Time O(n)  |  Space O(min(n,k))
 * Difficulty: Easy
 ******************************************************************************/
public class ContainsDuplicateWithinK {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> lastIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (lastIndex.containsKey(nums[i]) && i - lastIndex.get(nums[i]) <= k) return true;
            lastIndex.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1},     3)); // true
        System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1},     1)); // true
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2)); // false
    }
}
