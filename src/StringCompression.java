/******************************************************************************
 * Q27. String Compression — compress repeated characters.
 *
 * Example:
 *   Input : "aaabbbccddddee"
 *   Output: "a3b3c2d4e2"
 *   (If compressed string is NOT shorter, return original.)
 *
 * Complexity: Time O(n)  |  Space O(n)
 * Difficulty: Easy-Medium
 ******************************************************************************/
public class StringCompression {

    public static String compress(String s) {
        if (s == null || s.isEmpty()) return s;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            int  count = 0;
            while (i < s.length() && s.charAt(i) == ch) { i++; count++; }
            sb.append(ch);
            if (count > 1) sb.append(count);
        }
        String result = sb.toString();
        return result.length() < s.length() ? result : s;
    }

    public static void main(String[] args) {
        System.out.println(compress("aaabbbccddddee")); // a3b3c2d4e2
        System.out.println(compress("abc"));            // abc (no compression)
        System.out.println(compress("aabb"));           // aabb (same length)
    }
}
