package cn.isnap.leetcode.ProgrammingSkills.level1.day08;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        StringBuilder builder = new StringBuilder(chars1.length + chars2.length);
        int i = 0;
        while (i < chars1.length && i < chars2.length) {
            builder.append(chars1[i]).append(chars2[i++]);
        }

        if (i < chars1.length) {
            builder.append(word1.substring(i));
        }

        if (i < chars2.length) {
            builder.append(word2.substring(i));
        }

        return builder.toString();
    }
}
