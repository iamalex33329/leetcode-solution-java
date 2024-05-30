import datastructure.TreeNode;

/**
 *  112. Path Sum
 *
 *  Given the root of a binary tree and an integer targetSum, return true
 *  if the tree has a root-to-leaf path such that adding up all the values
 *  along the path equals targetSum.
 *
 *  A leaf is a node with no children.
 *
 */

public class Problem112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        return hasPathSumHelper(root, root.val, targetSum);
    }

    public boolean hasPathSumHelper(TreeNode node, int currentSum, int targetSum) {
        if (node.left == null && node.right == null) return currentSum == targetSum;

        boolean leftHPS = false, rightHPS = false;

        if (node.left != null) leftHPS = hasPathSumHelper(node.left, currentSum + node.left.val, targetSum);
        if (node.right != null) rightHPS = hasPathSumHelper(node.right, currentSum + node.right.val, targetSum);

        return (leftHPS || rightHPS);
    }

    public boolean hasPathSum2(TreeNode root, int targetSum) {
        if (root == null) return false;

        if (root.left == null && root.right == null) return root.val == targetSum;

        targetSum -= root.val;

        return hasPathSum2(root.left, targetSum) || hasPathSum2(root.right, targetSum);
    }
}
