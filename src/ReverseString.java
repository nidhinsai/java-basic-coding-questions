/******************************************************************************
 * Q11. Reverse a String without using any built-in reverse method.
 *
 * Example:
 *   Input : "automation"
 *   Output: "noitamotua"
 *
 * Complexity: Time O(n)  |  Space O(n)
 * Difficulty: Easy
 ******************************************************************************/
public class ReverseString {

    public static String reverse(String s) {
        if (s == null) return null;
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char tmp      = chars[left];
            chars[left++] = chars[right];
            chars[right--] = tmp;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverse("automation"));  // noitamotua
        System.out.println(reverse("hello"));       // olleh
        System.out.println(reverse("a"));           // a
    }
}
