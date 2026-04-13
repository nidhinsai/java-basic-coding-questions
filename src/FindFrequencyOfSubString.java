/******************************************************************************
 * Q03. Find the number of (possibly overlapping) occurrences of a substring.
 *
 * Example:
 *   Input : text = "10011001010010101", pattern = "101"
 *   Output: 3
 *
 * Approach : Slide a window of pattern.length() across the string and count
 *            matches.  This handles overlapping occurrences correctly.
 *
 * Complexity: Time O(n * m)  where n = text length, m = pattern length
 *             Space O(1)
 * Difficulty: Easy
 ******************************************************************************/
public class FindFrequencyOfSubString {

    /**
     * Counts all (including overlapping) occurrences of {@code pattern} in
     * {@code text}.
     *
     * @param text    the source string
     * @param pattern the substring to search for
     * @return number of occurrences
     */
    public static int countOccurrences(String text, String pattern) {
        if (text == null || pattern == null || pattern.isEmpty()) return 0;
        int count = 0;
        int idx   = 0;
        while ((idx = text.indexOf(pattern, idx)) != -1) {
            count++;
            idx++;   // allow overlapping matches
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOccurrences("10011001010010101", "101")); // 3
        System.out.println(countOccurrences("aaaa", "aa"));              // 3 (overlapping)
        System.out.println(countOccurrences("abcabc", "abc"));           // 2
    }
}
