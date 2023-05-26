import java.util.ArrayList;
import java.util.List;

/**
 *  94. Binary Tree Inorder Traversal
 *
 *  Given the root of a binary tree, return the inorder
 *  traversal of its nodes' values.
 *
 */

public class Problem94 {

    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }
        return list;
    }
}
