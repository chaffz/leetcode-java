package cn.isnap.leetcode.algorithm.level2.day01;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        return search(nums, target, lo, hi);
    }

    private int search(int[] nums, int target, int lo, int hi) {
        if (lo > hi) return -1;
        if (nums[lo] == target) return lo;
        if (nums[hi] == target) return hi;

        int mid = lo + (hi - lo) / 2;
        int left = search(nums, target, lo + 1, mid);
        if (left > 0) return left;
        return search(nums, target, mid, hi - 1);
    }
}
