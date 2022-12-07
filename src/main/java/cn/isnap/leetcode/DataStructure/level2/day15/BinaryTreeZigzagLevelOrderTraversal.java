package cn.isnap.leetcode.DataStructure.level2.day15;

import cn.isnap.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        zigzagLevelOrder(result, root, 0);
        return result;
    }

    private void zigzagLevelOrder(List<List<Integer>> result, TreeNode node, int level) {
        if (node == null) return;

        if (level == result.size())
            result.add(new LinkedList<>());

        if (level % 2 == 1) {
            result.get(level).add(0, node.val);
        } else {
            result.get(level).add(node.val);
        }
        zigzagLevelOrder(result, node.left, level + 1);
        zigzagLevelOrder(result, node.right, level + 1);
    }
}
