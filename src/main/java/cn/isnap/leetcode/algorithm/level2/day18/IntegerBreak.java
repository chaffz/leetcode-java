package cn.isnap.leetcode.algorithm.level2.day18;

public class IntegerBreak {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                int val1 = Math.max(dp[j], j);
                int val2 = Math.max(dp[i - j], i - j);
                dp[i] = Math.max(dp[i], val1 * val2);
            }
        }
        return dp[n];
    }
}
