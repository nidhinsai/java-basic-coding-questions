import java.util.Arrays;

/******************************************************************************
 * Q30. Move all zeroes to the end while maintaining relative order of non-zero
 *      elements.  In-place, minimum operations.
 *
 * Example:
 *   Input : {0, 1, 0, 3, 12}
 *   Output: {1, 3, 12, 0, 0}
 *
 * Approach : Two-pointer / snowball technique.
 *
 * Complexity: Time O(n)  |  Space O(1)
 * Difficulty: Easy
 ******************************************************************************/
public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) nums[insertPos++] = num;
        }
        while (insertPos < nums.length) nums[insertPos++] = 0;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr)); // [1, 3, 12, 0, 0]

        int[] arr2 = {0, 0, 1};
        moveZeroes(arr2);
        System.out.println(Arrays.toString(arr2)); // [1, 0, 0]
    }
}
