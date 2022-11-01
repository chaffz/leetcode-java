package cn.isnap.leetcode.lc75.level2.day15;

import cn.isnap.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        levelOrder(result, 0, root);
        return result;
    }

    private void levelOrder(List<Integer> result, int level, TreeNode node) {
        if (node == null) return;
        if (result.size() == level) {
            result.add(node.val);
        } else {
            result.set(level, node.val);
        }

        levelOrder(result, level + 1, node.left);
        levelOrder(result, level + 1, node.right);
    }
}
