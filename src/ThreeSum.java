import java.util.*;

/******************************************************************************
 * Q43. 3Sum — find all unique triplets that sum to zero.
 *
 * Example:
 *   Input : {-1, 0, 1, 2, -1, -4}
 *   Output: [[-1,-1,2],[-1,0,1]]
 *
 * Approach : Sort + two pointers.  Skip duplicates explicitly.
 *
 * Complexity: Time O(n²)  |  Space O(1) excluding output
 * Difficulty: Medium       ← LeetCode #15
 ******************************************************************************/
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;   // skip duplicate pivots
            int lo = i + 1, hi = nums.length - 1;
            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                if      (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    while (lo < hi && nums[lo] == nums[lo+1]) lo++;
                    while (lo < hi && nums[hi] == nums[hi-1]) hi--;
                    lo++; hi--;
                }
                else if (sum < 0)  lo++;
                else               hi--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4})); // [[-1,-1,2],[-1,0,1]]
        System.out.println(threeSum(new int[]{0,0,0}));           // [[0,0,0]]
    }
}
