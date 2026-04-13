/******************************************************************************
 * Q32. Print a diamond pattern of stars for a given height N.
 *
 * Example (N=5):
 *     *
 *    ***
 *   *****
 *    ***
 *     *
 *
 * Complexity: Time O(n²)  |  Space O(1)
 * Difficulty: Easy
 ******************************************************************************/
public class PrintDiamondPattern {

    public static void printDiamond(int n) {
        // Upper half (including middle)
        for (int i = 1; i <= n; i += 2) {
            for (int sp = 0; sp < (n - i) / 2; sp++) System.out.print(" ");
            for (int st = 0; st < i; st++) System.out.print("*");
            System.out.println();
        }
        // Lower half
        for (int i = n - 2; i >= 1; i -= 2) {
            for (int sp = 0; sp < (n - i) / 2; sp++) System.out.print(" ");
            for (int st = 0; st < i; st++) System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printDiamond(5);
    }
}
