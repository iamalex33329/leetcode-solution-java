/**
 *  129. Sum Root to Leaf Numbers
 *
 *  Given n non-negative integers representing an elevation map
 *  where the width of each bar is 1, compute how much water it
 *  can trap after raining.
 *
 */

import datastructure.TreeNode;

public class Problem129 {

    private int result = 0;

    public int sumNumbers(TreeNode root) {
        getSumNumbers(root, 0);
        return result;
    }

    public void getSumNumbers(TreeNode n, int prev) {
        if (n == null) {
            result += prev;
            return;
        }

        if (n.left != null) getSumNumbers(n.left, prev * 10 + n.val);
        if (n.right != null) getSumNumbers(n.right, prev * 10 + n.val);

        if (n.left == null && n.right == null) result += prev * 10 + n.val;
    }
}
