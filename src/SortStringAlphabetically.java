import java.util.Arrays;

/******************************************************************************
 * Q33. Sort the characters of a string in alphabetical (ASCII) order.
 *
 * Example:
 *   Input : "selenium"
 *   Output: "eeilmnus"
 *
 * Complexity: Time O(n log n)  |  Space O(n)
 * Difficulty: Easy
 ******************************************************************************/
public class SortStringAlphabetically {

    public static String sortString(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(sortString("selenium"));   // eeilmnus
        System.out.println(sortString("Automation")); // aaaimnootu
    }
}
