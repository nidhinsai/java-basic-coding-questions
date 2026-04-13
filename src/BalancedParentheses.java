import java.util.Deque;
import java.util.ArrayDeque;

/******************************************************************************
 * Q23. Check if a string of parentheses/brackets is balanced.
 *
 * Example:
 *   Input : "({[]})"  →  true
 *   Input : "({[}])"  →  false
 *   Input : "{["      →  false
 *
 * Approach : Stack — push opening brackets, pop and match on closing.
 *
 * Complexity: Time O(n)  |  Space O(n)
 * Difficulty: Easy-Medium
 ******************************************************************************/
public class BalancedParentheses {

    public static boolean isBalanced(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(': case '[': case '{': stack.push(ch); break;
                case ')': if (stack.isEmpty() || stack.pop() != '(') return false; break;
                case ']': if (stack.isEmpty() || stack.pop() != '[') return false; break;
                case '}': if (stack.isEmpty() || stack.pop() != '{') return false; break;
                default: break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("({[]})"));  // true
        System.out.println(isBalanced("({[}])"));  // false
        System.out.println(isBalanced("{["));       // false
        System.out.println(isBalanced(""));         // true
    }
}
