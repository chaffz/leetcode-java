package cn.isnap.leetcode.DataStructure.level1.day01;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums.length <= 0) return 0;

        int max = nums[0], far = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i], max + nums[i]);
            far = Math.max(max, far);
        }

        return far;
    }
}
