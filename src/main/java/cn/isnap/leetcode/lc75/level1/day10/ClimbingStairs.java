package cn.isnap.leetcode.lc75.level1.day10;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] dp = new int[]{0, 1, 2, 0};
        if (n <= 2) return dp[n];

        for (int i = 3; i <= n; i++) {
            dp[3] = dp[1] + dp[2];
            dp[1] = dp[2];
            dp[2] = dp[3];
        }

        return dp[3];
    }
}
