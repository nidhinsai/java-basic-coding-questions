import java.util.HashMap;
import java.util.Map;

/******************************************************************************
 * Q40. Longest Substring Without Repeating Characters.
 *
 * Example:
 *   Input : "abcabcbb"  →  3  ("abc")
 *   Input : "bbbbb"     →  1  ("b")
 *
 * Approach : Sliding window with a HashMap tracking last-seen index.
 *
 * Complexity: Time O(n)  |  Space O(min(n, alphabet_size))
 * Difficulty: Medium      ← LeetCode #3
 ******************************************************************************/
public class LongestSubstringWithoutRepeatingChars {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int maxLen = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (lastSeen.containsKey(ch) && lastSeen.get(ch) >= left) {
                left = lastSeen.get(ch) + 1;
            }
            lastSeen.put(ch, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3
        System.out.println(lengthOfLongestSubstring(""));         // 0
    }
}
