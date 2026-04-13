/******************************************************************************
 * Q34. Maximum Subarray Sum — Kadane's Algorithm.
 *
 * Example:
 *   Input : {-2, 1, -3, 4, -1, 2, 1, -5, 4}
 *   Output: 6  (subarray: {4, -1, 2, 1})
 *
 * Complexity: Time O(n)  |  Space O(1)
 * Difficulty: Medium      ← LeetCode #53, extremely frequent
 ******************************************************************************/
public class MaxSubarraySum {

    public static int maxSubarraySum(int[] nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar      = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        System.out.println(maxSubarraySum(new int[]{-2,1,-3,4,-1,2,1,-5,4})); // 6
        System.out.println(maxSubarraySum(new int[]{1}));                      // 1
        System.out.println(maxSubarraySum(new int[]{5, 4, -1, 7, 8}));        // 23
    }
}
