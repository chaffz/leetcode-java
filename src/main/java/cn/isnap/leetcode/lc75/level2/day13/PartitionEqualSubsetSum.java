package cn.isnap.leetcode.lc75.level2.day13;

public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int sums = 0;
        for (int num : nums) {
            sums += num;
        }

        if (sums % 2 == 1) return false;
        int T = sums / 2;
        int[] dp = new int[T + 1];
        for (int num : nums) {
            for (int j = T; j >= num; j--) {
                dp[j] = Math.max(dp[j], dp[j - num] + num);
            }
        }

        return dp[T] == T;
    }
}
