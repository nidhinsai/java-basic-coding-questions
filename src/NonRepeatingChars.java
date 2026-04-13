import java.util.LinkedHashMap;
import java.util.Map;

/******************************************************************************
 * Q08. Find all non-repeating (unique) characters in a string.
 *
 * Example:
 *   Input : "This is a sample java program"
 *   Output: T h l e j v o g
 *
 * Approach : Use a LinkedHashMap to count frequencies while preserving
 *            insertion order.  Then collect chars with count == 1.
 *
 * Complexity: Time O(n)  |  Space O(k)  where k = alphabet size
 * Difficulty: Easy
 ******************************************************************************/
public class NonRepeatingChars {

    /**
     * Returns the non-repeating characters in insertion order.
     *
     * @param input the source string (spaces count)
     * @return string of unique characters
     */
    public static String findNonRepeating(String input) {
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char ch : input.toCharArray()) {
            freq.merge(ch, 1, Integer::sum);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            if (e.getValue() == 1) sb.append(e.getKey());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input  = "This is a sample java program";
        String result = findNonRepeating(input);
        System.out.println("Non-repeating characters:");
        for (char ch : result.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
