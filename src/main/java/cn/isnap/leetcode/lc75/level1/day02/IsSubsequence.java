package cn.isnap.leetcode.lc75.level1.day02;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        int sLen = s.length();
        int tLen = t.length();

        for (; i < tLen && j < sLen; i++) {
            char cT = t.charAt(i);
            char cS = s.charAt(j);

            if (cT == cS) {
                j++;
            }
        }

        return j == sLen;
    }
}
