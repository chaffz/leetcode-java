package cn.isnap.leetcode.algorithm.level1.day01;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            if (target == nums[lo]) return lo;
            if (target == nums[hi]) return hi;
            int mid = lo + (hi - lo) / 2;
            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) hi = mid - 1;
            else lo = mid + 1;
        }
        return lo;
    }
}
