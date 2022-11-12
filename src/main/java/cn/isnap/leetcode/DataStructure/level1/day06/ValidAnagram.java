package cn.isnap.leetcode.DataStructure.level1.day06;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] SC = new int[123];
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            SC[aChar]++;
        }

        chars = t.toCharArray();
        for (char aChar : chars) {
            if (SC[aChar] < 1) return false;
            SC[aChar]--;
        }

        for (int c : SC) {
            if (c != 0) return false;
        }

        return true;
    }
}
