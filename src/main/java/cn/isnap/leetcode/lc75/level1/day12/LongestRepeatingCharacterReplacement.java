package cn.isnap.leetcode.lc75.level1.day12;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        char[] chars = s.toCharArray();
        if (chars.length <= k) return chars.length;

        int[] Counter = new int[26];
        int start = 0, longest = 0, max = 0;
        for (int end = 0; end < chars.length; end++) {
            int idx = chars[end] - 'A';
            Counter[idx]++;
            longest = Math.max(longest, Counter[idx]);

            if (end - start + 1 - longest > k) {
                Counter[chars[start] - 'A']--;
                start++;
            }

            max = Math.max(max, end - start + 1);
        }

        return max;
    }
}
