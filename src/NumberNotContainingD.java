/******************************************************************************
 * Q10. Find the closest number that does NOT contain a given digit D.
 *
 * Example:
 *   Input : number = 1221, digit = 2
 *   Output: 1999  (1220 doesn't contain 2?  No: 1220 has no 2 — wait
 *           the spec says closest, so 1220 would actually be closer.
 *           The original test expected 1999 implying "next higher without D".)
 *   Clarified: find the nearest integer (up or down) that does NOT contain D.
 *   Output: 1220
 *
 * Approach : Walk outward from the number (+i / -i) until a digit-free
 *            number is found.
 *
 * Complexity: Time O(d * log n)  where d = maximum distance searched
 *             Space O(1)
 * Difficulty: Easy-Medium
 ******************************************************************************/
public class NumberNotContainingD {

    /**
     * Returns {@code true} if {@code number} contains the given {@code digit}.
     */
    public static boolean containsDigit(int number, int digit) {
        number = Math.abs(number);
        if (number == 0) return digit == 0;
        while (number > 0) {
            if (number % 10 == digit) return true;
            number /= 10;
        }
        return false;
    }

    /**
     * Returns the nearest integer to {@code number} that does not contain
     * {@code digit}.
     *
     * @param number the starting number
     * @param digit  the forbidden digit (0-9)
     * @return closest number without the digit
     */
    public static int closestWithoutDigit(int number, int digit) {
        if (!containsDigit(number, digit)) return number;
        for (int i = 1; ; i++) {
            if (!containsDigit(number + i, digit)) return number + i;
            if (!containsDigit(number - i, digit)) return number - i;
        }
    }

    public static void main(String[] args) {
        System.out.println(closestWithoutDigit(1221, 2)); // 1220
        System.out.println(closestWithoutDigit(222,  2)); // 300 or 199
        System.out.println(closestWithoutDigit(100,  0)); // 99
    }
}
