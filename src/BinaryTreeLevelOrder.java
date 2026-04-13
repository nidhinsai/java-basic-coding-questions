import java.util.*;

/******************************************************************************
 * Q46. Binary Tree Level-Order Traversal (BFS).
 *
 * Example:
 *       1
 *      / \
 *     2   3
 *    / \
 *   4   5
 *
 *   Output: [[1],[2,3],[4,5]]
 *
 * Complexity: Time O(n)  |  Space O(n)
 * Difficulty: Medium
 ******************************************************************************/
public class BinaryTreeLevelOrder {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left  != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            result.add(level);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left  = new TreeNode(2); root.right = new TreeNode(3);
        root.left.left = new TreeNode(4); root.left.right = new TreeNode(5);
        System.out.println(levelOrder(root)); // [[1],[2,3],[4,5]]
    }
}
