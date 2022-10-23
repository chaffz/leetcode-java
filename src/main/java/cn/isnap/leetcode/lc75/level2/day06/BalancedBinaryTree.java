package cn.isnap.leetcode.lc75.level2.day06;

import cn.isnap.leetcode.TreeNode;

public class BalancedBinaryTree {
    private static class Result {
        int H;
        boolean R;

        Result(int h, boolean r) {
            this.H = h;
            this.R = r;
        }
    }
    public boolean isBalanced(TreeNode root) {
        Result result = new Result(0, true);
        high(root, result);
        return result.R;
    }

    private void high(TreeNode root, Result result) {
        if (root == null) return;

        Result left = new Result(0, true);
        Result right = new Result(0, true);
        high(root.left, left);
        high(root.right, right);

        if (!left.R || !right.R || Math.abs(left.H - right.H) > 1) {
            result.R = false;
            return;
        }

        result.H = Math.max(left.H, right.H) + 1;
    }
}
