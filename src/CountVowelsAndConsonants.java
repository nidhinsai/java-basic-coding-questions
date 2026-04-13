/******************************************************************************
 * Q28. Count vowels and consonants in a string.
 *
 * Example:
 *   Input : "Hello World"
 *   Output: Vowels=3  Consonants=7
 *
 * Complexity: Time O(n)  |  Space O(1)
 * Difficulty: Easy
 ******************************************************************************/
public class CountVowelsAndConsonants {

    public static void count(String s) {
        int vowels = 0, consonants = 0;
        String vowelSet = "aeiouAEIOU";
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowelSet.indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels=" + vowels + "  Consonants=" + consonants);
    }

    public static void main(String[] args) {
        count("Hello World");           // Vowels=3  Consonants=7
        count("Automation Testing");    // Vowels=7  Consonants=10
    }
}
