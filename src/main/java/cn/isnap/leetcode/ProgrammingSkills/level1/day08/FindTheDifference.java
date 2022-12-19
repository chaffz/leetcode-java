package cn.isnap.leetcode.ProgrammingSkills.level1.day08;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        char result = 0;
        for (int i = 0; i < chars1.length; i++) {
            result ^= chars1[i];
            result ^= chars2[i];
        }

        result ^= chars2[chars1.length];
        return result;
    }
}
