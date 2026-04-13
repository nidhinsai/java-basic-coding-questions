import java.util.HashMap;
import java.util.Map;

/******************************************************************************
 * Q06. Find the length of the longest palindrome that can be BUILT from the
 *      characters of a given string (characters may be rearranged).
 *
 * Example:
 *   Input : "abchellocab"
 *   Output: length = 9  (e.g. "abclolcba")
 *
 * Approach : Count character frequencies.  All even-count characters can be
 *            fully used.  At most one odd-count character sits in the middle.
 *
 * Complexity: Time O(n)  |  Space O(k)  where k = alphabet size
 * Difficulty: Easy
 ******************************************************************************/
public class LongestPossiblePalindrome {

    /**
     * Returns the maximum length palindrome constructable from {@code input}.
     *
     * @param input the source string
     * @return maximum palindrome length
     */
    public static int longestPalindromeLength(String input) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : input.toCharArray()) {
            freq.merge(ch, 1, Integer::sum);
        }
        int length   = 0;
        boolean odd  = false;
        for (int count : freq.values()) {
            length += (count / 2) * 2;
            if (count % 2 == 1) odd = true;
        }
        return odd ? length + 1 : length;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindromeLength("abchellocab")); // 9
        System.out.println(longestPalindromeLength("aabbcc"));      // 6
        System.out.println(longestPalindromeLength("a"));           // 1
    }
}
