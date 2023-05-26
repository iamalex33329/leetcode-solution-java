import java.util.ArrayList;
import java.util.List;

/**
 *  145. Binary Tree Postorder Traversal
 *
 *  Given the root of a binary tree, return the postorder
 *  traversal of its nodes' values.
 *
 */

public class Problem145 {

    List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);
        }
        return list;
    }
}
