/******************************************************************************
 * Q14. Check whether a number is prime.
 *
 * Example:
 *   Input : 17  →  true
 *   Input : 15  →  false
 *
 * Approach : Trial division up to √n.
 *
 * Complexity: Time O(√n)  |  Space O(1)
 * Difficulty: Easy
 ******************************************************************************/
public class CheckPrime {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; (long) i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] tests = {1, 2, 3, 4, 17, 18, 97, 100};
        for (int t : tests) {
            System.out.printf("%4d  →  %s%n", t, isPrime(t));
        }
    }
}
