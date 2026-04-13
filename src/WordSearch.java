/******************************************************************************
 * Q50. Word Search — given a 2D grid and a word, determine if the word can be
 *      constructed from sequentially adjacent cells (no re-use).
 *
 * Example:
 *   Grid: {{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}}
 *   Word: "ABCCED"  →  true
 *   Word: "SEE"     →  true
 *   Word: "ABCB"    →  false
 *
 * Approach : DFS + backtracking.
 *
 * Complexity: Time O(4^L * m * n)  where L = word length
 *             Space O(L) recursion depth
 * Difficulty: Medium-Hard    ← LeetCode #79
 ******************************************************************************/
public class WordSearch {

    private static final int[][] DIRS = {{0,1},{0,-1},{1,0},{-1,0}};

    public static boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (dfs(board, word, i, j, 0)) return true;
        return false;
    }

    private static boolean dfs(char[][] board, String word, int r, int c, int idx) {
        if (idx == word.length()) return true;
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length) return false;
        if (board[r][c] != word.charAt(idx)) return false;
        char tmp = board[r][c];
        board[r][c] = '#';   // mark visited
        for (int[] d : DIRS) {
            if (dfs(board, word, r + d[0], c + d[1], idx + 1)) {
                board[r][c] = tmp;
                return true;
            }
        }
        board[r][c] = tmp;   // restore
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        System.out.println(exist(board, "ABCCED")); // true
        System.out.println(exist(board, "SEE"));    // true
        System.out.println(exist(board, "ABCB"));   // false
    }
}
