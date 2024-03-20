import datastructure.TreeNode;

/**
 *  100. Same Tree
 *
 *  Given the roots of two binary trees p and q, write
 *  a function to check if they are the same or not.
 *
 *  Two binary trees are considered the same if they are
 *  structurally identical, and the nodes have the same value.
 *
 */

public class Problem100 {

    /* 利用遞迴檢查子樹的root以及左右子樹是否相同 */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right) ;
    }
}
