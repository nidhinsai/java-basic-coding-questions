import java.util.Arrays;

/******************************************************************************
 * Q16. Check if two strings are anagrams of each other.
 *
 * Example:
 *   Input : "listen", "silent"  →  true
 *   Input : "hello",  "world"   →  false
 *
 * Approach : Sort both strings and compare — or use a 26-bucket char count.
 *
 * Complexity: Time O(n log n)  |  Space O(n)   (sorting approach)
 * Difficulty: Easy
 ******************************************************************************/
public class AnagramCheck {

    public static boolean isAnagram(String a, String b) {
        if (a == null || b == null) return false;
        if (a.length() != b.length()) return false;
        char[] ca = a.toLowerCase().toCharArray();
        char[] cb = b.toLowerCase().toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        return Arrays.equals(ca, cb);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("hello",  "world"));  // false
        System.out.println(isAnagram("Astronomer", "Moon starer")); // false (space differs)
    }
}
