/**
 *  144. Binary Tree Preorder Traversal
 *
 *  Given the root of a binary tree, return the preorder
 *  traversal of its nodes' values.
 *
 */

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem144 {

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return list;
    }
}
