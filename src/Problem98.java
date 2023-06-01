import java.util.ArrayList;
import java.util.List;

/**
 *  98. Validate Binary Search Tree
 *
 *  Given the root of a binary tree, determine if it is a valid
 *  binary search tree (BST).
 *
 *  A valid BST is defined as follows:
 *
 *  The left subtree of a node contains only nodes with keys less than the node's key.
 *  The right subtree of a node contains only nodes with keys greater than the node's key.
 *  Both the left and right subtrees must also be binary search trees.
 *
 */

public class Problem98 {

    public boolean isValidBST(TreeNode root) {
        inorder(root);
        for (int i=0; i<list.size()-1; i++) {
            if (list.get(i) > list.get(i+1)) { return false; }
        }
        return true;
    }

    List<Integer> list = new ArrayList<>();
    private void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    private int minValue = Integer.MIN_VALUE;
    public boolean isValidBST1(TreeNode root) {
        if (root == null) return true;

        if (!isValidBST(root.left)) return false;

        if (root.val <= minValue) return false;
        minValue = root.val;

        if (!isValidBST(root.right)) return false;

        return true;
    }
}
