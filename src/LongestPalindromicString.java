/******************************************************************************
 * Q05. Find the longest palindromic substring of a given string.
 *
 * Example:
 *   Input : "bananas"
 *   Output: "anana"
 *
 * Approach : Expand-around-center. For each character (and gap between
 *            characters) expand outward while the characters match.
 *            Runs in O(n²) — much better than the O(n³) brute-force.
 *
 * Complexity: Time O(n²)  |  Space O(1)
 * Difficulty: Medium
 ******************************************************************************/
public class LongestPalindromicString {

    /**
     * Returns the start index and max length from a center expansion.
     */
    private static int[] expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // left+1 .. right-1 is the palindrome
        return new int[]{left + 1, right - left - 1};
    }

    /**
     * Finds and returns the longest palindromic substring.
     *
     * @param s the input string
     * @return longest palindromic substring
     */
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;
        int start = 0, maxLen = 1;
        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindromes
            int[] odd  = expand(s, i, i);
            // Even-length palindromes
            int[] even = expand(s, i, i + 1);
            if (odd[1]  > maxLen) { start = odd[0];  maxLen = odd[1]; }
            if (even[1] > maxLen) { start = even[0]; maxLen = even[1]; }
        }
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("bananas"));  // anana
        System.out.println(longestPalindrome("racecar"));  // racecar
        System.out.println(longestPalindrome("abcba"));    // abcba
    }
}
