package cn.isnap.leetcode.DataStructure.level1.day11;

import cn.isnap.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @see cn.isnap.leetcode.lc75.level1.day06.BinaryTreeLevelOrderTraversal
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        List<Integer> level = new ArrayList<>();

        while (!deque.isEmpty()) {
            level.clear();
            int sz = deque.size();
            for (int i = 0; i < sz; i++) {
                TreeNode n = deque.poll();
                level.add(n.val);

                if (n.left != null) deque.addLast(n.left);
                if (n.right != null) deque.addLast(n.right);
            }
            result.add(new ArrayList<>(level));
        }
        return result;
    }
}
