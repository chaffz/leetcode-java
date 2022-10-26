package cn.isnap.leetcode.lc75.level2.day08;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int lo, int hi) {
        if (lo > hi) return -1;
        if (nums[lo] == target) return lo;
        if (nums[hi] == target) return hi;
        int mid = lo + (hi - lo) / 2;
        if (nums[mid] == target) return mid;
        int l = search(nums, target, lo, mid - 1);
        if (l > 0) return l;
        int r = search(nums, target, mid + 1, hi);
        if (r > 0) return r;
        return -1;
    }
}
