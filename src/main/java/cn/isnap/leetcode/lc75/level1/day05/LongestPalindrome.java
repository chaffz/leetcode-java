package cn.isnap.leetcode.lc75.level1.day05;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int [] mapped = new int[58];
        for (int i = 0; i <s.length(); i++) {
            char c = s.charAt(i);
            mapped[c-'A']++;
        }

        int result = 0, mod1 = 0;
        for (int i : mapped) {
            result += i/2;
            if (mod1 == 0 && i % 2 != 0) mod1 = 1;
        }

        result *= 2;
        result += mod1;

        return result;
    }
}
