/******************************************************************************
 * Q48. Valid Parenthesis String — '*' can be '(', ')', or ''.
 *
 * Example:
 *   Input : "(*))"  →  true
 *   Input : "(*)"   →  true
 *   Input : "(**)"  →  true
 *
 * Approach : Track possible range [minOpen, maxOpen] of open paren counts.
 *
 * Complexity: Time O(n)  |  Space O(1)
 * Difficulty: Medium
 ******************************************************************************/
public class ValidParenthesisString {

    public static boolean checkValidString(String s) {
        int minOpen = 0, maxOpen = 0;
        for (char ch : s.toCharArray()) {
            if      (ch == '(') { minOpen++; maxOpen++; }
            else if (ch == ')') { minOpen--; maxOpen--; }
            else                { minOpen--; maxOpen++; }  // '*'
            if (maxOpen < 0) return false;   // too many close parens regardless
            minOpen = Math.max(minOpen, 0);  // open count can't go negative
        }
        return minOpen == 0;
    }

    public static void main(String[] args) {
        System.out.println(checkValidString("(*)"));   // true
        System.out.println(checkValidString("(*))"));  // true
        System.out.println(checkValidString("(*"));    // true
        System.out.println(checkValidString(")"));     // false
    }
}
