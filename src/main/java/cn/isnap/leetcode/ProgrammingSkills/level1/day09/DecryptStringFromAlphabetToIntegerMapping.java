package cn.isnap.leetcode.ProgrammingSkills.level1.day09;

public class DecryptStringFromAlphabetToIntegerMapping {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; ) {
            if (i + 2 < chars.length && chars[i + 2] == '#') {
                sb.append((char) (96 + Integer.parseInt(s.substring(i, i + 2))));
                i += 3;
            } else {
                sb.append((char) (chars[i] + 48));
                i++;
            }
        }

        return sb.toString();
    }
}
