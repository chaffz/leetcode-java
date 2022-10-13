package cn.isnap.leetcode.lc75.level1.day11;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[]{cost[0], cost[1], 0};

        for (int i = 2; i < cost.length; i++) {
            // cost[i] += Math.min(cost[i-1], cost[i-2]);
            dp[2] = Math.min(dp[0], dp[1]) + cost[i];
            dp[0] = dp[1];
            dp[1] = dp[2];
        }

        // int n = cost.length;
        // return Math.min(cost[n-1], cost[n-2]);
        return Math.min(dp[0], dp[1]);
    }
}
