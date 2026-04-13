/******************************************************************************
 * Q01. Check if one string is a rotation of another.
 *
 * Example:
 *   Input : str1 = "welcome", str2 = "comewel"
 *   Output: true
 *
 * Approach : Concatenate str2 with itself; if str1 is a substring the strings
 *            are rotational.  Uses String.contains() which internally runs
 *            a linear search.
 *
 * Complexity: Time O(n)  |  Space O(n)
 * Difficulty: Easy
 ******************************************************************************/
public class CheckIfStringsAreRotational {

    /**
     * Returns {@code true} if {@code str2} is a rotated version of {@code str1}.
     *
     * @param str1 the reference string
     * @param str2 the candidate string to test
     * @return whether str2 is a rotation of str1
     */
    public static boolean isRotational(String str1, String str2) {
        if (str1 == null || str2 == null)          return false;
        if (str1.length() != str2.length())        return false;
        if (str1.isEmpty())                        return true;
        return (str2 + str2).contains(str1);
    }

    public static void main(String[] args) {
        System.out.println(isRotational("welcome", "comewel"));   // true
        System.out.println(isRotational("abcde",   "cdeab"));     // true
        System.out.println(isRotational("abcde",   "abced"));     // false
    }
}
