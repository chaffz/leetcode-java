package cn.isnap.leetcode.ProgrammingSkills.level1.day09;

public class ToLowerCase {
    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += 32;
            }
        }

        return new String(chars);
    }
}
