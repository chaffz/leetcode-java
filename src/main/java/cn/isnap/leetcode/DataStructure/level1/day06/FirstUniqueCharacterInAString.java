package cn.isnap.leetcode.DataStructure.level1.day06;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] unique = new int[26];
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            unique[aChar - 'a']++;
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < unique.length; i++) {
            if (unique[i] == 1) {
                result = Math.min(result, s.indexOf(i + 'a'));
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
