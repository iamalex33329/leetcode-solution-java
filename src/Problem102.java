import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 *  102. Binary Tree Level Order Traversal
 *
 *  Given the root of a binary tree, return the level order traversal
 *  of its nodes' values. (i.e., from left to right, level by level).
 *
 */

public class Problem102 {

    List<List<Integer>> results = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        bfs(root, 0, results);
        return results;
    }

    private void bfs(TreeNode node, int level, List<List<Integer>> list) {
        if (node == null) return;

        if (list.size() <= level) { list.add(new ArrayList<>()); }

        list.get(level).add(node.val);

        level++;

        bfs(node.left, level, list);
        bfs(node.right, level, list);
    }
}
