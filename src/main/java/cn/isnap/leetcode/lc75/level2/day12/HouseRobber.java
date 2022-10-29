package cn.isnap.leetcode.lc75.level2.day12;

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int[] dp = new int[3];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[2] = Math.max(nums[i] + dp[0], dp[1]);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }

        return dp[2];
    }
}
