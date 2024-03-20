import datastructure.TreeNode;

import java.util.Arrays;

/**
 *  1161. Maximum Level Sum of a Binary Tree
 *
 *  Given the root of a binary tree, the level of its root is 1,
 *  the level of its children is 2, and so on.
 *
 *  Return the smallest level x such that the sum of all the values
 *  of nodes at level x is maximal.
 *
 */

public class Problem1161 {

    private final int[] arr = new int[15];

    public int maxLevelSum(TreeNode root) {
        Arrays.fill(arr, Integer.MIN_VALUE);

        calMaxLevelSum(root, 0);

        int max = arr[0], maxIndex = 0;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] >= max) { max = arr[i]; maxIndex = i; }
        }

        System.gc();
        return maxIndex+1;
    }

    public void calMaxLevelSum(TreeNode node, int level) {
        if (node == null) return;

        arr[level] = arr[level] + node.val;
        calMaxLevelSum(node.left, level+1);
        calMaxLevelSum(node.right, level+1);
    }
}
