package cn.isnap.leetcode.lc75.level1.day10;

public class FibonacciNumber {
    public int fib(int n) {
        int[] dp = new int[]{0, 1, 0};
        if (n < 2) return dp[n];

        for (int i = 2; i <= n; i++) {
            dp[2] = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = dp[2];
        }

        return dp[2];
    }
}
