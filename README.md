# Java Basic Coding Questions

> 50 handpicked **Java interview coding questions** for **QA Automation** roles — from Easy warm-ups to Hard production patterns.  
> Every file compiles with vanilla Java (no external libraries), includes big-O complexity annotations and a runnable `main()`.

---

## Question Index

| # | Class File | Topic | Difficulty | Time | Space |
|---|-----------|-------|-----------|------|-------|
| 01 | `CheckIfStringsAreRotational.java` | Rotational string check | Easy | O(n) | O(n) |
| 02 | `FindFirstRepeatingNumber.java` | First repeating number | Easy | O(n) | O(n) |
| 03 | `FindFrequencyOfSubString.java` | Substring frequency (incl. overlap) | Easy | O(n·m) | O(1) |
| 04 | `FindTheLongestPositiveNumberSequence.java` | Longest consecutive +ve sequence | Easy | O(n) | O(1) |
| 05 | `LongestPalindromicString.java` | Longest palindromic substring | Medium | O(n²) | O(1) |
| 06 | `LongestPossiblePalindrome.java` | Max length palindrome from chars | Medium | O(n) | O(n) |
| 07 | `MaxProductOfThree.java` | Max product of three elements | Medium | O(n log n) | O(1) |
| 08 | `NonRepeatingChars.java` | All non-repeating characters | Easy | O(n) | O(1) |
| 09 | `NonRepeatingCharsUsingHashMap.java` | First non-repeating character | Easy | O(n) | O(1) |
| 10 | `NumberNotContainingD.java` | Numbers not containing digit D | Easy | O(n·d) | O(1) |
| 11 | `ReverseString.java` | Reverse a string | Easy | O(n) | O(n) |
| 12 | `ReverseWords.java` | Reverse words in a sentence | Easy | O(n) | O(n) |
| 13 | `FibonacciSequence.java` | Fibonacci sequence (iterative) | Easy | O(n) | O(1) |
| 14 | `CheckPrime.java` | Prime number check | Easy | O(√n) | O(1) |
| 15 | `FactorialIterativeAndRecursive.java` | Factorial (iterative + recursive) | Easy | O(n) | O(n) |
| 16 | `AnagramCheck.java` | Anagram check (sort & compare) | Easy | O(n log n) | O(n) |
| 17 | `TwoSum.java` | Two Sum — target pair | Easy | O(n) | O(n) |
| 18 | `DuplicatesInArray.java` | Find all duplicates | Easy | O(n) | O(n) |
| 19 | `MissingNumberInArray.java` | Missing number in 1..N | Easy | O(n) | O(1) |
| 20 | `BinarySearch.java` | Binary search (iterative) | Easy | O(log n) | O(1) |
| 21 | `BubbleSort.java` | Bubble sort (optimised) | Easy | O(n²) | O(1) |
| 22 | `LinkedListReversal.java` | Reverse a linked list | Easy | O(n) | O(1) |
| 23 | `BalancedParentheses.java` | Balanced parentheses check | Easy | O(n) | O(n) |
| 24 | `MergeSortedArrays.java` | Merge two sorted arrays | Easy | O(m+n) | O(m+n) |
| 25 | `StackUsingQueues.java` | Stack using two queues | Medium | O(n) push | O(n) |
| 26 | `QueueUsingStacks.java` | Queue using two stacks | Medium | O(1) amort | O(n) |
| 27 | `StringCompression.java` | Run-length string compression | Easy | O(n) | O(n) |
| 28 | `CountVowelsAndConsonants.java` | Count vowels & consonants | Easy | O(n) | O(1) |
| 29 | `SecondLargestElement.java` | Second largest — single pass | Easy | O(n) | O(1) |
| 30 | `MoveZeroes.java` | Move zeroes to end in-place | Easy | O(n) | O(1) |
| 31 | `CountOccurrencesOfChar.java` | Count character occurrences | Easy | O(n) | O(1) |
| 32 | `PrintDiamondPattern.java` | Diamond star pattern | Easy | O(n²) | O(1) |
| 33 | `SortStringAlphabetically.java` | Sort string characters | Easy | O(n log n) | O(n) |
| 34 | `MaxSubarraySum.java` | Kadane's algorithm | Medium | O(n) | O(1) |
| 35 | `ContainsDuplicateWithinK.java` | Duplicate within distance k | Easy | O(n) | O(k) |
| 36 | `MatrixTranspose.java` | Transpose N×N matrix in-place | Easy | O(n²) | O(1) |
| 37 | `PowerOfTwo.java` | Power-of-two bit trick | Easy | O(1) | O(1) |
| 38 | `GroupAnagrams.java` | Group anagram families | Medium | O(n·k log k) | O(nk) |
| 39 | `ProductExceptSelf.java` | Product of array except self | Medium | O(n) | O(1) |
| 40 | `LongestSubstringWithoutRepeatingChars.java` | Longest substring no repeat | Medium | O(n) | O(k) |
| 41 | `ValidPalindrome.java` | Valid palindrome (ignore non-alpha) | Easy | O(n) | O(1) |
| 42 | `ClimbingStairs.java` | Climbing stairs (DP) | Easy | O(n) | O(1) |
| 43 | `ThreeSum.java` | 3Sum — zero triplets | Medium | O(n²) | O(1) |
| 44 | `FindCycleInLinkedList.java` | Detect cycle — Floyd's algorithm | Medium | O(n) | O(1) |
| 45 | `LRUCache.java` | LRU Cache (LinkedHashMap) | Hard | O(1) | O(cap) |
| 46 | `BinaryTreeLevelOrder.java` | Binary tree level-order BFS | Medium | O(n) | O(n) |
| 47 | `MergeSort.java` | Merge Sort | Medium | O(n log n) | O(n) |
| 48 | `ValidParenthesisString.java` | Valid parenthesis with wildcards | Medium | O(n) | O(1) |
| 49 | `CountBits.java` | Count bits 0..n (DP) | Easy | O(n) | O(n) |
| 50 | `WordSearch.java` | Word Search — DFS backtracking | Hard | O(4^L·mn) | O(L) |

---

## How to Run

```bash
# Compile a single file
javac src/TwoSum.java

# Run it
java -cp src TwoSum
```

No build tool required — pure Java files.

---

## Difficulty Breakdown

| Difficulty | Count |
|-----------|-------|
| Easy | 26 |
| Easy-Medium | 4 |
| Medium | 17 |
| Hard | 3 |

---

## Topics Covered

- **Strings** — rotation, anagram, palindrome, compression, frequency, reversal
- **Arrays** — two-sum, sort, search, duplicates, missing number, product, 3-sum, zeroes
- **Sorting** — bubble sort, merge sort, string sort
- **Linked Lists** — reversal, cycle detection
- **Stacks & Queues** — balanced parentheses, stack↔queue implementations
- **Hash Maps** — grouping, frequency, sliding window
- **Dynamic Programming** — climbing stairs, Kadane's, count bits
- **Trees** — level-order BFS traversal
- **Matrices** — transpose, word search (DFS)
- **Bit Manipulation** — power of two, count bits
- **Design** — LRU Cache

---

## LeetCode Reference

| LeetCode # | File |
|-----------|------|
| #1 Two Sum | `TwoSum.java` |
| #3 Longest Substring Without Repeating | `LongestSubstringWithoutRepeatingChars.java` |
| #15 3Sum | `ThreeSum.java` |
| #53 Maximum Subarray | `MaxSubarraySum.java` |
| #70 Climbing Stairs | `ClimbingStairs.java` |
| #79 Word Search | `WordSearch.java` |
| #238 Product of Array Except Self | `ProductExceptSelf.java` |
