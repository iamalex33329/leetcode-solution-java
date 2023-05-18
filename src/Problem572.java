/**
 *  572. Subtree of Another Tree
 *
 *  Given the roots of two binary trees root and subRoot, return
 *  true if there is a subtree of root with the same structure and
 *  node values of subRoot and false otherwise.
 *
 *  A subtree of a binary tree is a tree that consists of a node
 *  in tree and all of this node's descendants. The tree could also be
 *  considered as a subtree of itself.
 *
 */

public class Problem572 {

    private boolean isSameTree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) { return true; }
        if (root == null || subRoot == null) { return false; }

        if (root.val == subRoot.val) {
            return isSameTree(root.left, subRoot.left) && isSubtree(root.right, subRoot.right);
        }
        return false;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) { return true; }
        if (root == null || subRoot == null) { return false; }

        return isSameTree(root, subRoot) || isSubtree(root.left, subRoot)  || isSubtree(root.right, subRoot);
    }
}
