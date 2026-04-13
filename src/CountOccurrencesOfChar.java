/******************************************************************************
 * Q31. Count the occurrences of a particular character in a string.
 *
 * Example:
 *   Input : "selenium webdriver", 'e'
 *   Output: 3
 *
 * Complexity: Time O(n)  |  Space O(1)
 * Difficulty: Easy
 ******************************************************************************/
public class CountOccurrencesOfChar {

    public static int count(String s, char target) {
        int cnt = 0;
        for (char ch : s.toCharArray()) {
            if (ch == target) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(count("selenium webdriver", 'e')); // 3
        System.out.println(count("aababc", 'a'));              // 3
    }
}
