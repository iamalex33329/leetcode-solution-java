/**
 *  222. Count Complete Tree Nodes
 *
 *  Given the root of a complete binary tree, return the number
 *  of the nodes in the tree.
 *
 *  According to Wikipedia, every level, except possibly the last,
 *  is completely filled in a complete binary tree, and all nodes
 *  in the last level are as far left as possible. It can have
 *  between 1 and 2h nodes inclusive at the last level h.
 *
 *  Design an algorithm that runs in less than O(n) time complexity.
 *
 */

import datastructure.TreeNode;

public class Problem222 {

    public int countNodes(TreeNode root) {

        if (root == null) return 0;

        int left_count = countNodes(root.left);
        int right_count = countNodes(root.right);

        return left_count + right_count + 1;
    }
}
