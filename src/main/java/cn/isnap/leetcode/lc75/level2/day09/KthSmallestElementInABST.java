package cn.isnap.leetcode.lc75.level2.day09;

import cn.isnap.leetcode.TreeNode;

public class KthSmallestElementInABST {
    public int kthSmallest(TreeNode root, int k) {
        int[] result = new int[]{0, 0};
        kthSmallest(result, root, k);
        return result[0];
    }

    private void kthSmallest(int[] result, TreeNode root, int k) {
        if (root == null) return;
        kthSmallest(result, root.left, k);
        result[1]++;
        if (result[1] == k) {
            result[0] = root.val;
            return;
        }
        kthSmallest(result, root.right, k);
    }
}
