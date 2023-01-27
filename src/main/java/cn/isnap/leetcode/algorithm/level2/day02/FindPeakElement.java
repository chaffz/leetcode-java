package cn.isnap.leetcode.algorithm.level2.day02;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        int[] min = new int[]{Integer.MAX_VALUE};
        findPeakElement(min, nums, lo, hi);
        return min[0];
    }

    private void findPeakElement(int[] min, int[] nums, int lo, int hi) {
        if (lo > hi)
            return;
        int mid = lo + (hi - lo) / 2;
        if ((mid - 1) >= 0 && (mid + 1) < nums.length) {
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                min[0] = mid;
            }
        } else if ((mid - 1) < 0 && (mid + 1) < nums.length) {
            if (nums[mid] > nums[mid + 1]) {
                min[0] = mid;
            }
        } else if ((mid - 1) >= 0 && (mid + 1) >= nums.length) {
            if (nums[mid] > nums[mid - 1]) {
                min[0] = mid;
            }
        } else {
            min[0] = mid;
        }

        findPeakElement(min, nums, lo, mid - 1);
        findPeakElement(min, nums, mid + 1, hi);
    }
}
