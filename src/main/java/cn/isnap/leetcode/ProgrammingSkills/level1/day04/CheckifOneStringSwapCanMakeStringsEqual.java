package cn.isnap.leetcode.ProgrammingSkills.level1.day04;

import java.util.Arrays;

public class CheckifOneStringSwapCanMakeStringsEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int i = 0, j = chars1.length - 1;
        while (chars1[i] == chars2[i]) i++;
        while (chars1[j] == chars2[j]) j--;
        char c = chars2[i];
        chars2[i] = chars2[j];
        chars2[j] = c;

        return Arrays.equals(chars1, chars2);
    }
}
