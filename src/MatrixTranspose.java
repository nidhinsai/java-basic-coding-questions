/******************************************************************************
 * Q36. Transpose an N×N matrix in-place.
 *
 * Example:
 *   Input        Output
 *   1 2 3        1 4 7
 *   4 5 6   →   2 5 8
 *   7 8 9        3 6 9
 *
 * Complexity: Time O(n²)  |  Space O(1)
 * Difficulty: Easy-Medium
 ******************************************************************************/
public class MatrixTranspose {

    public static void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp       = matrix[i][j];
                matrix[i][j]  = matrix[j][i];
                matrix[j][i]  = tmp;
            }
        }
    }

    private static void print(int[][] m) {
        for (int[] row : m) {
            for (int v : row) System.out.printf("%3d", v);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Before:"); print(matrix);
        transpose(matrix);
        System.out.println("After:");  print(matrix);
    }
}
