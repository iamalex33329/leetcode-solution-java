import datastructure.TreeNode;

/**
 *  226. Invert Binary Tree
 *
 *  Given the root of a binary tree, invert the tree, and return its root.
 *
 */

public class Problem226 {

    public TreeNode invertTree(TreeNode root) {
        TreeNode result = new TreeNode();

        if (root != null) {
            result.val = root.val;
            result.left = invertTree(root.right);
            result.right = invertTree(root.left);
        } else { return null; }

        return result;
    }
}
