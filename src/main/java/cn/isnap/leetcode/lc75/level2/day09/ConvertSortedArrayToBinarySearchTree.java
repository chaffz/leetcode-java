package cn.isnap.leetcode.lc75.level2.day09;

import cn.isnap.leetcode.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        return sortedArrayToBST(nums, lo, hi);
    }

    private TreeNode sortedArrayToBST(int[] nums, int lo, int hi) {
        if (lo > hi) return null;

        int mid = lo + (hi - lo) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, lo, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, hi);

        return root;
    }
}
