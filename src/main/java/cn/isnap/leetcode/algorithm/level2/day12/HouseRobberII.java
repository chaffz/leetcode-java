package cn.isnap.leetcode.algorithm.level2.day12;

import java.util.Arrays;

public class HouseRobberII {
    public int rob(int[] nums) {
        int rob1 = sbuRob(Arrays.copyOfRange(nums, 0, nums.length - 1));
        int rob2 = sbuRob(Arrays.copyOfRange(nums, 1, nums.length - 1));
        int rob3 = sbuRob(Arrays.copyOfRange(nums, 1, nums.length));

        return Math.max(rob1, Math.max(rob2, rob3));
    }

    private int sbuRob(int[] nums) {
        int n = nums.length;
        if (n < 1) return 0;
        else if (n < 2) return nums[0];
        else if (n < 3) return Math.max(nums[0], nums[1]);

        int[] dp = new int[]{0, 0, 0};
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], nums[0]);
        dp[2] = dp[1];
        for (int i = 2; i < n; i++) {
            dp[2] = Math.max(dp[1], dp[0] + nums[i]);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[2];
    }
}
