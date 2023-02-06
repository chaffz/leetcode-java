package cn.isnap.leetcode.algorithm.level2.day12;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n];
        dp[n-1] = true;

        for (int i = n-2; i >=0 ; i--) {
            for (int j = 1; j < nums[i]; j++) {
                if ((i + nums[j] + 1) >= n) {
                    dp[i] = true;
                } else {
                    dp[i] = dp[i] || dp[i + j];
                }

                if (dp[i]) break;
            }
        }

        return dp[0];
    }
}
