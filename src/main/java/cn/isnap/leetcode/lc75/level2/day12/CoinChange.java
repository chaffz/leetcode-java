package cn.isnap.leetcode.lc75.level2.day12;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = 10001;
        }

        for (int coin : coins) {
            for (int i = 1; i <= amount; i++) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i-coin] + 1);
                }
            }
        }

        return dp[amount] == 10001 ? -1 : dp[amount];
    }

    public int coinChange2(int[] coins, int amount) {
        int[] memo = new int[amount+1];
        return dfs(memo, coins, amount);
    }

    private int dfs(int[] memo, int[] coins, int amount) {
        if (amount == 0) return 0;
        if (memo[amount] != 0) return memo[amount];

        final int InvalidValue = 10001;
        int result = InvalidValue;

        for (int coin : coins) {
            if (amount >= coin) {
                int change = dfs(memo, coins, amount - coin);
                if (change != -1) {
                    result = Math.min(result, change + 1);
                }
            }
        }
        memo[amount] = result;
        if (result >= InvalidValue) return -1;
        return result;
    }
}
