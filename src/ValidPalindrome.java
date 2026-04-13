/******************************************************************************
 * Q41. Valid Palindrome — ignore non-alphanumeric characters, case-insensitive.
 *
 * Example:
 *   Input : "A man, a plan, a canal: Panama"  →  true
 *   Input : "race a car"                       →  false
 *
 * Approach : Two pointers from both ends, skip non-alphanumeric.
 *
 * Complexity: Time O(n)  |  Space O(1)
 * Difficulty: Easy
 ******************************************************************************/
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left  < right && !Character.isLetterOrDigit(s.charAt(left)))  left++;
            while (right > left  && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++; right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car"));                      // false
        System.out.println(isPalindrome(" "));                               // true
    }
}
