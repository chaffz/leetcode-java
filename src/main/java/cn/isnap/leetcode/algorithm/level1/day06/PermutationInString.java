package cn.isnap.leetcode.algorithm.level1.day06;

import java.util.Arrays;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int[] counter1 = new int[26];
        int[] counter2 = new int[26];
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            counter1[chars1[i] - 'a']++;
            counter2[chars2[i] - 'a']++;
        }

        for (int i = 0; i < chars2.length - chars1.length; i++) {
            if (Arrays.equals(counter1, counter2)) return true;
            counter2[chars2[i] - 'a']--;
            counter2[chars2[i + chars1.length] - 'a']++;
        }
        return Arrays.equals(counter1, counter2);
    }
}
