package cn.isnap.leetcode.algorithm.level1.day04;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int idx = 0, lo = 0, hi = chars.length - 1;
        while (true) {
            if (idx < chars.length && chars[idx] != ' ') {
                idx++;
                continue;
            }

            hi = idx - 1;
            while (lo < hi) {
                char t = chars[lo];
                chars[lo++] = chars[hi];
                chars[hi--] = t;
            }
            idx++;
            lo = idx;
            if (idx >= chars.length) break;
        }

        return new String(chars);
    }
}
