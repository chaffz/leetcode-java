package cn.isnap.leetcode.algorithm.level2.day13;

import java.util.Arrays;

public class JumpGameII {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= nums[i] && i + j < nums.length; j++) {
                dp[i + j] = Math.min(dp[i] + 1, dp[i + j]);
            }
        }

        return dp[nums.length - 1];
    }
}
