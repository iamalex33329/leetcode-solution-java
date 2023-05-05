/**
 *  104. Maximum Depth of Binary Tree
 *
 *  Given the root of a binary tree, return its maximum depth.
 *
 *  A binary tree's maximum depth is the number of nodes along
 *  the longest path from the root node down to the farthest leaf node.
 *
 */

public class Problem104 {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left_height = maxDepth(root.left) + 1;
        int right_height = maxDepth(root.right) + 1;

        return Math.max(left_height, right_height);
    }
}
