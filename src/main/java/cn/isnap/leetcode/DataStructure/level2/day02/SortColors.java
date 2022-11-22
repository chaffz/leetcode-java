package cn.isnap.leetcode.DataStructure.level2.day02;

public class SortColors {
    public void sortColors(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        int idx = 0;
        while (idx <= hi) {
            if (nums[idx] == 2) {
                swap(nums, idx, hi);
                hi--;
            }
            if (nums[idx] == 0) {
                swap(nums, idx, lo);
                lo++;
            }

            if (nums[idx] != 2) idx++;
        }
    }

    private void swap(int[] nums, int lo, int mid) {
        int t = nums[lo];
        nums[lo] = nums[mid];
        nums[mid] = t;
    }
}
