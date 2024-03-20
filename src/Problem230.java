import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 *  230. Kth Smallest Element in a BST
 *
 *  Given the root of a binary search tree, and an integer
 *  k, return the kth smallest value (1-indexed) of all the
 *  values of the nodes in the tree.
 *
 */

public class Problem230 {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list, k);
        return list.get(k - 1);
    }

    private void inorder(TreeNode root, List<Integer> list, int k) {
        if (list.size() == k) return;
        if (root == null) return;

        inorder(root.left, list, k);
        list.add(root.val);
        inorder(root.right, list, k);
    }
}
