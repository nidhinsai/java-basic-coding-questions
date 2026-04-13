import java.util.Arrays;

/******************************************************************************
 * Q39. Product of Array Except Self — without division, O(n).
 *
 * Example:
 *   Input : {1, 2, 3, 4}
 *   Output: {24, 12, 8, 6}
 *
 * Approach : Two passes — left products then right products.
 *
 * Complexity: Time O(n)  |  Space O(1) output array not counted
 * Difficulty: Medium      ← LeetCode #238
 ******************************************************************************/
public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int n       = nums.length;
        int[] result = new int[n];
        result[0]   = 1;
        // Left prefix products
        for (int i = 1; i < n; i++) result[i] = result[i-1] * nums[i-1];
        // Multiply by right suffix products
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right     *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
        // [24, 12, 8, 6]
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));
        // [0, 0, 9, 0, 0]
    }
}
