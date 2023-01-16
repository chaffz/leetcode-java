package cn.isnap.leetcode.algorithm.level1.day04;

public class ReverseString {
    public void reverseString(char[] s) {
        int lo = 0, hi = s.length - 1;
        while (lo < hi) {
            char t = s[lo];
            s[lo++] = s[hi];
            s[hi--] = t;
        }
    }
}
