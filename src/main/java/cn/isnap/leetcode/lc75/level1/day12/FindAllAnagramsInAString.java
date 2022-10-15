package cn.isnap.leetcode.lc75.level1.day12;

import java.util.LinkedList;
import java.util.List;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> r = new LinkedList<>();
        int sLen = s.length(), pLen = p.length();
        if (sLen < pLen) return r;

        int[] sCount = new int[26], pCount = new int[26];
        for (int i = 0; i < pLen; i++) {
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }

        if (equals(sCount, pCount))
            r.add(0);

        for (int i = pLen; i < sLen; i++) {
            int iOld = s.charAt(i - pLen) - 'a';
            int iNew = s.charAt(i) - 'a';
            sCount[iOld]--;
            sCount[iNew]++;

            if (equals(sCount, pCount))
                r.add(i - pLen + 1);
        }

        return r;
    }

    private boolean equals(int[] s, int[] p) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] != p[i]) return false;
        }

        return true;
    }
}
