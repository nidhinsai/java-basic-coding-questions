/******************************************************************************
 * Q12. Reverse the words in a sentence.
 *
 * Example:
 *   Input : "Java is fun"
 *   Output: "fun is Java"
 *
 * Complexity: Time O(n)  |  Space O(n)
 * Difficulty: Easy
 ******************************************************************************/
public class ReverseWords {

    public static String reverseWords(String sentence) {
        if (sentence == null || sentence.isBlank()) return sentence;
        String[] words = sentence.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(' ');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Java is fun"));              // fun is Java
        System.out.println(reverseWords("  hello   world  "));        // world hello
        System.out.println(reverseWords("QA Automation Engineer"));   // Engineer Automation QA
    }
}
