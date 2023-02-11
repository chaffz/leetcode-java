package cn.isnap.leetcode.algorithm.level2.day15;

public class DecodeWays {
    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        int[] dp = new int[chars.length + 1];
        dp[0] = 1;
        if (chars[0] != '0') dp[1] = 1;

        for (int i = 2; i <= chars.length; i++) {
            if (chars[i - 1] != '0')
                dp[i] = dp[i - 1];
            int n = (chars[i - 2] - '0') * 10 + (chars[i - 1] - '0');
            if (n >= 10 && n <= 26)
                dp[i] += dp[i - 2];
        }
        return dp[chars.length];
    }
}
