/******************************************************************************
 * Q19. Find the missing number in an array containing 1..N with one missing.
 *
 * Example:
 *   Input : {1, 2, 4, 5, 6}  N = 6
 *   Output: 3
 *
 * Approach : Expected sum = N*(N+1)/2.  Subtract actual sum → missing number.
 *
 * Complexity: Time O(n)  |  Space O(1)
 * Difficulty: Easy
 ******************************************************************************/
public class MissingNumberInArray {

    public static int findMissing(int[] arr, int n) {
        long expected = (long) n * (n + 1) / 2;
        long actual   = 0;
        for (int x : arr) actual += x;
        return (int)(expected - actual);
    }

    public static void main(String[] args) {
        System.out.println(findMissing(new int[]{1, 2, 4, 5, 6}, 6));      // 3
        System.out.println(findMissing(new int[]{1, 2, 3, 5},    5));      // 4
        System.out.println(findMissing(new int[]{2, 3, 4, 5},    5));      // 1
    }
}
