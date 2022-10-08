package cn.isnap.leetcode.lc75.level1.day06;

import cn.isnap.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrder(result, 0, root);
        return result;
    }

    private void levelOrder(List<List<Integer>> result, int level, TreeNode node) {
        if (node == null) return;

        List<Integer> levels;
        if (result.size() == level) {
            levels = new LinkedList<>();
            result.add(levels);
        } else {
            levels = result.get(level);
        }

        levels.add(node.val);
        levelOrder(result, level + 1, node.left);
        levelOrder(result, level + 1, node.right);
    }
}
