package cn.isnap.leetcode.lc75.level2.day14;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        if (chars.length < 2) return chars.length;
        int[] counter = new int[256];
        int left = 0, right = 0, answer = 0;

        while (right < chars.length) {
            counter[chars[right]]++;
            while (counter[chars[right]] > 1) {
                counter[chars[left]]--;
                left++;
            }

            int subSize = right - left;
            if (subSize > answer) {
                answer = subSize;
            }
            right++;
        }

        return answer + 1;
    }
}
