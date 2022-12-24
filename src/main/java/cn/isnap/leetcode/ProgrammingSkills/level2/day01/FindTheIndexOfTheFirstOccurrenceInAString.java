package cn.isnap.leetcode.ProgrammingSkills.level2.day01;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        for (int i = 0; i <= len1 - len2; i++) {
            String sub = haystack.substring(i, i + len2);
            if (sub.equals(needle))
                return i;
        }
        return -1;
    }
}
