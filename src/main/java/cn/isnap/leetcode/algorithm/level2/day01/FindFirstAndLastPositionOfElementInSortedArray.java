package cn.isnap.leetcode.algorithm.level2.day01;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        int[] result = new int[]{-1, -1};

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < target) lo = mid + 1;
            else hi = mid;
        }
        if (lo >= nums.length || nums[lo] != target) return result;
        result[0] = lo;

        hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2 + 1;
            if (nums[mid] > target) hi = mid - 1;
            else lo = mid;
        }
        result[1] = hi;

        return result;
    }
}
