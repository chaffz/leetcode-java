package cn.isnap.leetcode.DataStructure.level1.day06;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] SC = new int[123];
        char[] chars = magazine.toCharArray();
        for (char aChar : chars) {
            SC[aChar]++;
        }

        chars = ransomNote.toCharArray();
        for (char aChar : chars) {
            if (SC[aChar] < 1) return false;
            SC[aChar]--;
        }

        for (int c : SC) {
            if (c < 0) return false;
        }

        return true;
    }
}
