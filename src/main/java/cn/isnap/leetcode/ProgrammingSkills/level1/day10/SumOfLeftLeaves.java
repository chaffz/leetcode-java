package cn.isnap.leetcode.ProgrammingSkills.level1.day10;

import cn.isnap.leetcode.TreeNode;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int[] result = new int[]{0};
        sumOfLeftLeaves(result, root);
        return result[0];
    }

    private void sumOfLeftLeaves(int[] result, TreeNode node) {
        if (node == null) return;
        if (node.left != null && node.left.left == null && node.left.right == null) {
            result[0] += node.left.val;
        }

        sumOfLeftLeaves(result, node.left);
        sumOfLeftLeaves(result, node.right);
    }
}
