package cn.isnap.leetcode.DataStructure.level2.day09;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int[] max = new int[]{0};
        String answer = "";
        for (int i = 0; i < chars.length; i++) {
            answer = getString(s, chars, max, answer, i, i);
            answer = getString(s, chars, max, answer, i, i + 1);
        }
        return answer;
    }

    private String getString(String s, char[] chars, int[] max, String answer, int start, int end) {
        while (start >= 0 && end < chars.length) {
            if (chars[start] == chars[end]) {
                int len = end - start + 1;
                if (len > max[0]) {
                    answer = s.substring(start, end + 1);
                    max[0] = len;
                }
            } else break;

            start--;
            end++;
        }
        return answer;
    }
}
