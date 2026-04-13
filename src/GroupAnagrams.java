import java.util.*;

/******************************************************************************
 * Q38. Group Anagrams — group a list of strings by their anagram families.
 *
 * Example:
 *   Input : ["eat","tea","tan","ate","nat","bat"]
 *   Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * Approach : Sort each word as a canonical key, group by key in a HashMap.
 *
 * Complexity: Time O(n * k log k)  where k = max word length
 *             Space O(n * k)
 * Difficulty: Medium
 ******************************************************************************/
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> map = new HashMap<>();
        for (String w : words) {
            char[] chars = w.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(w);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(input);
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
