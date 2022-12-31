package cn.isnap.leetcode.ProgrammingSkills.level2.day06;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int i = chars.length - 1;
        while (i >= 0 && chars[i] == ' ') {
            i--;
        }
        int j = i;
        while (j >= 0 && chars[j] != ' ') {
            j--;
        }
        return i - j;
    }
}
