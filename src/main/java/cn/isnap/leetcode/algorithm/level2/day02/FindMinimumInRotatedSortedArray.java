package cn.isnap.leetcode.algorithm.level2.day02;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        int[] min = new int[]{Integer.MAX_VALUE};
        findMin(min, nums, lo, hi);
        return min[0];
    }

    private void findMin(int[] min, int[] nums, int lo, int hi) {
        if (lo > hi)
            return;
        int mid = lo + (hi - lo) / 2;
        if (nums[mid] < min[0])
            min[0] = nums[mid];
        findMin(min, nums, lo, mid - 1);
        findMin(min, nums, mid + 1, hi);
    }
}
